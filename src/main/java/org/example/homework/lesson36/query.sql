begin;
INSERT INTO orders
(id,user_id,created_at,status_id,comment)
VALUES (21,13,'2024-02-25',12,'cash payment');

INSERT INTO public.order_items
(id, order_id,product_id,quantity)
VALUES (60,9,11,10),(61,20,31,13),(62,1,41,5);
commit;