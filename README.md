Playing around with hibernate while trying to get it to work.

hibernate.cfg.xml file is located in src/main/resources:

<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>


        <property name="connection.url">jdbc:postgresql://localhost:5432/postgres</property> <!-- BD Mane -->
        <property name="connection.driver_class">org.postgresql.Driver</property> <!-- DB Driver -->
        <property name="connection.username">username</property> <!-- DB User -->
        <property name="connection.password">password</property> <!-- DB Password -->

        <property name="dialect">org.hibernate.dialect.PostgreSQLDialect</property> <!-- DB Dialect -->
        <property name="hbm2ddl.auto">create</property> <!-- create / create-drop / update -->

        <property name="show_sql">true</property> <!-- Show SQL in console -->
        <property name="format_sql">true</property> <!-- Show SQL formatted -->

        <!-- Mapping  classes below -->

        <mapping class="org.example.entity.Human"></mapping>
        <mapping class="org.example.entity.Car"></mapping>
        <mapping class="org.example.entity.mapped.Product"></mapping>

    </session-factory>
</hibernate-configuration>