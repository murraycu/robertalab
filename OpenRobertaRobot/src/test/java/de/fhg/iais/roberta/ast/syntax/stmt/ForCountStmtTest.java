package de.fhg.iais.roberta.ast.syntax.stmt;

import org.junit.Test;

import de.fhg.iais.roberta.testutil.Helper;

public class ForCountStmtTest {

    @Test
    public void forCountStmt() throws Exception {
        String a = "\nfor ( float i = 1; i < 10; i += 15 ) {\n" + "}\n" + "for ( float i = 1; i < 10; i += 15 ) {\n" + "    System.out.println(\"\");\n" + "}";

        Helper.assertCodeIsOk(a, "/syntax/stmt/forCount_stmt.xml");
    }
}