package kihons;

import framework.exceptions.NotImplementedYetException;
import framework.bases.SqlKihonBase;

import javax.management.Query;
import javax.xml.transform.Result;
import java.beans.Statement;
import java.sql.ResultSet;

public class SqlKihon extends SqlKihonBase {

    /* Given SQL Tables defined as:
     * ----------------------------
     * CREATE TABLE Person
       (
         PersonId int not null PRIMARY KEY,
         FirstName varchar(50),
         LastName varchar(50),
         Age int
       )
     *
     * CREATE TABLE Address
       (
         AddressId int not null PRIMARY KEY,
         PersonId int,
         Line1 varchar(50),
         Line2 varchar(50),
         City varchar(50),
         State varchar(50),
         Zip varchar(9)
       )
     */

    @Override
    protected String Select_All_Fields_And_Rows_From_Person() {
        throw new NotImplementedYetException();
    }

    @Override
    protected String selectAllFieldsFromPersonJoinedToAddress() {
        throw new NotImplementedYetException();
    }

    @Override
    protected String selectFirstNameFromPersonWhereLastNameEqualsRayburn() {
        throw new NotImplementedYetException();
    }

    @Override
    protected String selectAllFieldsFromPersonLeftOuterJoinedToAddress() {
        throw new NotImplementedYetException();
    }

    @Override
    protected String insertPersonId4NamedMikeJohnsonAge5ToPerson() {
        throw new NotImplementedYetException();
    }

    @Override
    protected String updateAllLastNamesRayburnToJohnsonInPerson() {
        throw new NotImplementedYetException();
    }
}
