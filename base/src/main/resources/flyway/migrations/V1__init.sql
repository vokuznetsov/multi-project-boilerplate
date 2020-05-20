CREATE TABLE boilerplate_test_table
(
    id      BIGSERIAL    NOT NULL,
    name    VARCHAR(255) NOT NULL,
    comment VARCHAR(255),
    PRIMARY KEY (id),
    CONSTRAINT boilerplate_test_table_name_unique UNIQUE (name)
);