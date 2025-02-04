PGDMP          (                z            enoca    14.4    14.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16561    enoca    DATABASE     b   CREATE DATABASE enoca WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE enoca;
                postgres    false            �            1259    16595    departments    TABLE     }   CREATE TABLE public.departments (
    department_id smallint NOT NULL,
    department_name character varying(50) NOT NULL
);
    DROP TABLE public.departments;
       public         heap    postgres    false            �            1259    16608    departments_department_id_seq    SEQUENCE     �   ALTER TABLE public.departments ALTER COLUMN department_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.departments_department_id_seq
    START WITH 4
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            �            1259    16592 	   employees    TABLE     �   CREATE TABLE public.employees (
    employee_id smallint NOT NULL,
    first_name character varying(10) NOT NULL,
    last_name character varying(20) NOT NULL,
    salary character varying(30),
    department_id smallint NOT NULL
);
    DROP TABLE public.employees;
       public         heap    postgres    false            �            1259    16610    employees_employee_id_seq    SEQUENCE     �   ALTER TABLE public.employees ALTER COLUMN employee_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.employees_employee_id_seq
    START WITH 2
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    209            �            1259    16607    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            e           2606    16599    departments pk_departments 
   CONSTRAINT     c   ALTER TABLE ONLY public.departments
    ADD CONSTRAINT pk_departments PRIMARY KEY (department_id);
 D   ALTER TABLE ONLY public.departments DROP CONSTRAINT pk_departments;
       public            postgres    false    210            c           2606    16601    employees pk_employees 
   CONSTRAINT     ]   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT pk_employees PRIMARY KEY (employee_id);
 @   ALTER TABLE ONLY public.employees DROP CONSTRAINT pk_employees;
       public            postgres    false    209            f           2606    16602    employees fk_department    FK CONSTRAINT     �   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES public.departments(department_id);
 A   ALTER TABLE ONLY public.employees DROP CONSTRAINT fk_department;
       public          postgres    false    3173    210    209           