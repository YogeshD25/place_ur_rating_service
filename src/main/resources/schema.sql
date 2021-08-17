

CREATE TABLE public.review_rating (
	review_id int8 NOT NULL,
	place_id int8 NULL,
	review_description varchar(255) NULL,
	review_star float4 NULL,
	created_at DATETIME NOT NULL
                    DEFAULT CURRENT_TIMESTAMP,
	user_mobile varchar(255) NULL,
	CONSTRAINT review_rating_pkey PRIMARY KEY (review_id)
);

INSERT INTO public.review_rating
(review_id, place_id, review_description, review_star, user_mobile)
VALUES(1, 1, 'Good place', 4.0, '7385787937');