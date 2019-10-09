package kihons;

import framework.bases.SqlDdlKihonBase;
import framework.exceptions.NotImplementedYetException;

public class SqlDdlKihon extends SqlDdlKihonBase {
    @Override
    public String createTablePersonWithOneColumn() {
        var sb = new StringBuilder();
        sb.append("CREATE TABLE Person");
        sb.append("(");
        sb.append("PersonId INT NOT NULL PRIMARY KEY");
        sb.append(");");
        return sb.toString();
    }
}
