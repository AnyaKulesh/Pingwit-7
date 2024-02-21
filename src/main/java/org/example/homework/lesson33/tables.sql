

CREATE TABLE public.goods (
    id bigint NOT NULL,
    name character varying(300) NOT NULL,
    description character varying(300) NOT NULL,
    price numeric NOT NULL
);


ALTER TABLE public.goods OWNER TO postgres;


CREATE TABLE public.orders (
    id bigint NOT NULL,
    registration_date timestamp without time zone NOT NULL,
    users_id bigint NOT NULL,
    goods_id bigint NOT NULL,
    goods_number bigint NOT NULL,
    status_id bigint NOT NULL,
    comments text
);


ALTER TABLE public.orders OWNER TO postgres;

CREATE TABLE public.status_orders (
    id bigint NOT NULL,
    name character varying(300) NOT NULL
);


ALTER TABLE public.status_orders OWNER TO postgres;


CREATE TABLE public.users (
    id bigint NOT NULL,
    name character varying(300) NOT NULL,
    surname character varying(300) NOT NULL,
    email character varying(320) NOT NULL,
    phone character varying(15) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;



ALTER TABLE ONLY public.goods
    ADD CONSTRAINT goods_pkey PRIMARY KEY (id);


ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id);



ALTER TABLE ONLY public.status_orders
    ADD CONSTRAINT status_orders_pkey PRIMARY KEY (id);


ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);



ALTER TABLE ONLY public.orders
    ADD CONSTRAINT "fk_orders_goods_id " FOREIGN KEY (goods_id) REFERENCES public.goods(id);




ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fk_orders_status_id FOREIGN KEY (status_id) REFERENCES public.status_orders(id);




ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fk_orders_users_id FOREIGN KEY (users_id) REFERENCES public.users(id);



