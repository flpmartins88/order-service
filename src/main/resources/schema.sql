CREATE TABLE orders(
    id            IDENTITY    NOT NULL PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL
);

CREATE TABLE items(
    id       IDENTITY    NOT NULL PRIMARY KEY,
    order_id BIGINT      NOT NULL,
    name     VARCHAR(50) NOT NULL,
    quantity INTEGER     NOT NULL,
    value    LONG        NOT NULL,
    CONSTRAINT item_order_fk FOREIGN KEY (order_id) REFERENCES orders(id)
);