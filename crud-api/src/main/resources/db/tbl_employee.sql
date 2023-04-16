CREATE TABLE IF NOT EXISTS crud_api.tbl_employee
(
	id SERIAL,
	name VARCHAR(255),
	gender VARCHAR(255),
	departament VARCHAR(255),
	dob DATE,
	CONSTRAINT crud_api_pkey PRIMARY KEY (id)
)