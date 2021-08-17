
CREATE TABLE IF NOT EXISTS review_rating (
    review_id SERIAL PRIMARY KEY,
	place_id int8 NULL,
	review_description varchar(255) NULL,
	review_star float4 NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	user_mobile varchar(255) NULL
);

INSERT INTO review_rating
( place_id, review_description, review_star, user_mobile)
VALUES( 1, 'Good place', 4.0, '7385787937');