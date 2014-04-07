/**
 * Created by Papa Formigas on 07-04-2014.
 */
public class main {
    static public void main(String[] args ){
       AST a = new AST();
        a.parse("//@INV var1=]10,20]\n");
        a.parse("//@INV var1=]10,20] && var2!={2,(var3+41)*2} || var3 = ]12,23+var4]\n");
        a.parse("//@INV var1=]10,20] && (var4 = {2,3,var5+128})\n");
        a.parse("//@INV var1=]10,20] && (var5 = {2,3,var5+128})\n");
        a.parse("//@INV var1=]10,20] && (var4 = {2,3,var5+128})\n");
        a.parse("//@INV var1=]10,20] && (var4 = {2,3,var5+128})\n");

        System.out.print(a.trees.size());


    }
}
