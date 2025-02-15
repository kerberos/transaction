# transaction project

Spring boot Web application with REST API for getting list of transactions from DB.

## Install and run

1. Download the project or clone using git
   ```bash
   git clone https://github.com/kerberos/transaction.git
   ```

2. Prepare MS SQL database. You can use Docker

   a) Download the official MS SQL Server image from Docker Hub:
      ```bash
      docker pull mcr.microsoft.com/mssql/server
      ```

   b) Run a container with MS SQL Server:
   ```bash
   docker run -e 'ACCEPT_EULA=Y' -e 'MSSQL_SA_PASSWORD=kerberos-2025' -p 1433:1433 --name sqlserver -d mcr.microsoft.com/mssql/server
   ```
   (later just run existing container: `docker start sqlserver`)

   c) Create database `transact`

3. Check `application.yaml`: property is set `sql.init.mode: always`
   Db entities will be generated based on given path to sql `resources/sql/ta_database.sql`

4. Run the TransactionAplication.
   After database objects are created, change prperty to `sql.init.mode: never` to skip SQL script executions for further app runs.

## API testing

example request http://localhost:8080/accounts/1234567890/transactions

## API documentation

Access http://localhost:8080/swagger-ui.html in browser.