package example.Token;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

/**
 * Test file for using token factory by antlr
 */
public class MyToken extends CommonToken {
    public String srcName;
    public String text;
    public int type;
    public int position;


    public MyToken(int type, String text){
        super(type, text);
    }

    public MyToken(Pair<TokenSource, CharStream> source, int type,
                   int channel, int start, int stop){
        super(source, type, channel, start, stop);
    }

    @Override
    public String toString(){
        String t = super.toString();
        return srcName + ":"+t;
    }

    public void printToken(){
        System.out.println("text: " + this.text + " | type: " + this.type + " | pos: " + position);
    }
}
