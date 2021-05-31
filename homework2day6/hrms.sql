SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

CREATE FUNCTION public.validate_email_by_domain(user_id integer, web_address character varying) RETURNS boolean
    LANGUAGE plpgsql
    AS $$
DECLARE
	DECLARE user_email_address varchar(320);
    DECLARE result boolean;
BEGIN
	SELECT email_address INTO user_email_address FROM users where id = user_id;
    SELECT web_address like '%' || SUBSTRING(user_email_address,POSITION('@' in user_email_address) + 1) INTO result;
	IF result = false THEN
		raise 'E-mail(%) and web address(%) must have the same domain name.',user_email_address,web_address;
	END IF;
	RETURN result;
END; $$;


ALTER FUNCTION public.validate_email_by_domain(user_id integer, web_address character varying) OWNER TO postgres;



CREATE TABLE public.candidates (
    id integer NOT NULL,
    first_name character varying(35) NOT NULL,
    last_name character varying(35) NOT NULL,
    identification_number character varying(11) NOT NULL,
    birth_date date NOT NULL
);


ALTER TABLE public.candidates OWNER TO postgres;


CREATE TABLE public.employee_confirms (
    id integer NOT NULL,
    employee_id integer NOT NULL,
    is_confirmed boolean DEFAULT false NOT NULL
);


ALTER TABLE public.employee_confirms OWNER TO postgres;

CREATE TABLE public.employee_confirms_employers (
    id integer NOT NULL,
    employer_id integer NOT NULL
);


ALTER TABLE public.employee_confirms_employers OWNER TO postgres;
ALTER TABLE public.employee_confirms ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.employee_confirms_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);



CREATE TABLE public.employees (
    id integer NOT NULL,
    first_name character varying(35) NOT NULL,
    last_name character varying(35) NOT NULL
);


ALTER TABLE public.employees OWNER TO postgres;


CREATE TABLE public.employers (
    id integer NOT NULL,
    company_name character varying(255) NOT NULL,
    web_address character varying(255) NOT NULL,
    phone_number character varying
);


ALTER TABLE public.employers OWNER TO postgres;



CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;



CREATE TABLE public.job_titles (
    id integer NOT NULL,
    title character varying(255) NOT NULL
);


ALTER TABLE public.job_titles OWNER TO postgres;



ALTER TABLE public.job_titles ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.job_titles_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);



CREATE TABLE public.users (
    id integer NOT NULL,
    email_address character varying(320) NOT NULL,
    password character varying(25) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;


ALTER TABLE public.users ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);



CREATE TABLE public.verification_codes (
    id integer NOT NULL,
    code character varying(38) NOT NULL,
    is_verified boolean DEFAULT false NOT NULL,
    user_id integer
);


ALTER TABLE public.verification_codes OWNER TO postgres;


ALTER TABLE public.verification_codes ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.verification_codes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


SELECT pg_catalog.setval('public.employee_confirms_id_seq', 1, false);


SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


SELECT pg_catalog.setval('public.job_titles_id_seq', 5, true);


SELECT pg_catalog.setval('public.users_id_seq', 14, true);



SELECT pg_catalog.setval('public.verification_codes_id_seq', 14, true);




ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT pk_candidates PRIMARY KEY (id);



ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT pk_employee_confirms PRIMARY KEY (id);


ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT pk_employee_confirms_employers PRIMARY KEY (id);



ALTER TABLE ONLY public.employees
    ADD CONSTRAINT pk_employees PRIMARY KEY (id);



ALTER TABLE ONLY public.employers
    ADD CONSTRAINT pk_employers PRIMARY KEY (id);




ALTER TABLE ONLY public.job_titles
    ADD CONSTRAINT pk_job_titles PRIMARY KEY (id);




ALTER TABLE ONLY public.users
    ADD CONSTRAINT pk_users PRIMARY KEY (id);




ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT pk_verification_codes PRIMARY KEY (id);




ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT uc_candidates_identification_number UNIQUE (identification_number);



ALTER TABLE ONLY public.job_titles
    ADD CONSTRAINT uc_job_titles_title UNIQUE (title);




ALTER TABLE ONLY public.users
    ADD CONSTRAINT uc_users_email_address UNIQUE (email_address);




ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT uc_verification_codes_code UNIQUE (code);





ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT fk_candidates_users FOREIGN KEY (id) REFERENCES public.users(id) ON DELETE CASCADE;



ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT fk_employee_confirms_employees FOREIGN KEY (employee_id) REFERENCES public.employees(id) ON DELETE CASCADE;




ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT fk_employee_confirms_employers_employee_confirms FOREIGN KEY (id) REFERENCES public.employee_confirms(id) ON DELETE CASCADE;



ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT fk_employee_confirms_employers_employers FOREIGN KEY (employer_id) REFERENCES public.employers(id) ON DELETE CASCADE;




ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fk_employees_users FOREIGN KEY (id) REFERENCES public.users(id) ON DELETE CASCADE;



ALTER TABLE ONLY public.employers
    ADD CONSTRAINT fk_employers_users FOREIGN KEY (id) REFERENCES public.users(id) ON DELETE CASCADE;




ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT fk_vc FOREIGN KEY (user_id) REFERENCES public.users(id) NOT VALID;



COMMENT ON CONSTRAINT fk_vc ON public.verification_codes IS 'Foreign Key Verification Codes';

