Drop table if exists distribution_services_lines_items;

Drop table if exists distribution_services;

CREATE TABLE distribution_services (
	id Serial,
	supplier character varying (50),
	receiver integer,
	createdDate timestamp without time zone DEFAULT now(),
	status character varying (30),
	modifiedBy integer,
	lastUpdatedDate timestamp without time zone DEFAULT now(),

	 	CONSTRAINT distribution_services_pkey PRIMARY KEY (id),

    	CONSTRAINT distribution_services_facilities_fkey FOREIGN KEY (id)
        REFERENCES public.facilities (id) MATCH SIMPLE,

		CONSTRAINT distribution_services_users_fkey FOREIGN KEY (id)
        REFERENCES public.users (id) MATCH SIMPLE

        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE distribution_services_lines_items (
	id Serial,
	distributionServiceID integer,
	product integer,
	quantity character varying (20),
	modifiedBy integer,
	lastUpdatedDate timestamp without time zone DEFAULT now(),
	createdDate timestamp without time zone DEFAULT now(),

	 	CONSTRAINT distribution_services_lines_items_pkey PRIMARY KEY (id),

    	CONSTRAINT distribution_services_lines_items_products_fkey FOREIGN KEY (id)
        REFERENCES public.products (id) MATCH SIMPLE,

		CONSTRAINT distribution_services_lines_items_users_fkey FOREIGN KEY (id)
        REFERENCES public.users (id) MATCH SIMPLE,

		CONSTRAINT distribution_services_lines_items_distribution_services_fkey FOREIGN KEY (id)
        REFERENCES public.distribution_services (id) MATCH SIMPLE

        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);















