grammar Bridge;


@header {
    import java.util.HashMap;
}

@parser::members{

 public static HashMap<String, String> islandMap = new HashMap<String, String>(){{
        put("SOF", "EOF");
        put("{", "}");
        put("(", ")");
    }};

    public static HashMap<String, String> repairMap = new HashMap<String, String>(){{
                put("{", "}");
                put("(", ")");
                put("}", "{");
                put(")", "(");
    }};

    public static HashMap<String, String> refMap = new HashMap<String, String>(){{
       put("TAB", "TAB");
    }};

    public static boolean matchBridges(String a, String b, int apos, int bpos){
        return (a.equals(b) && apos == bpos);
    }
    public static boolean matchBrace(String a, String b, int apos, int bpos){ return (a.equals(b) && apos==bpos); }
    public static boolean machtParenthesis(String a, String b,int apos, int bpos){ return (a.equals(b) && apos==bpos);}

}

prog:              token* EOF;

token:		water|island|ref|newline;
ref:        TAB;
island:             lbrace
                    | rbrace
                    | lparenthesis
                    | rparenthesis
                    //| semicolon
                    //| ref
                   // | newline
                    ;

water:              ID | INT | OTHER| semicolon;

lbrace:          '{';
rbrace:         '}';
lparenthesis:    '(';
rparenthesis:   ')';


OTHER:              '=';
ID:                 [a-zA-Z]+;

INT:                [0-9]+;

semicolon:          ';';
newline:  '\r'? '\n';
TAB:		     [ \t]+;
//WS:	' ' -> skip;



