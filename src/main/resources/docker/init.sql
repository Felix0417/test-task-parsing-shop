CREATE TABLE "graphic_cards_with_min_average_price" (
    id SERIAL PRIMARY KEY,
    price INT NOT NULL,
    of_date DATE NOT NULL UNIQUE
);

INSERT INTO graphic_cards_with_min_average_price(price, of_date)
values (98000, current_date - interval '7 days'),
       (96200, current_date - interval '6 days'),
       (95550, current_date - interval '5 days'),
       (93880, current_date - interval '4 days'),
       (99990, current_date - interval '3 days'),
       (91505, current_date - interval '2 days'),
       (101250, current_date - interval '1 days');