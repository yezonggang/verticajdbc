import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

@Data
public class TestRunnable implements Runnable {

        public String tableName;
        public Properties myProp = new Properties();

    public TestRunnable(String tableName) {
        this.tableName = tableName;
    }

    @Override
        public void run() {
            myProp.put("user", "dbadmin");
            myProp.put("password", "passwd");
            Connection conn;
            try {
                conn = DriverManager.getConnection("jdbc:vertica://10.121.198.45:5433/dbadmin",myProp);
                String sql = String.format("insert into %s(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,a2,b2,c2,d2,e2,f2,g2,h2,i2,j2,k2,l2,m2,n2,o2,p2,q2,r2,s2,t2,u2,v2,w2,x2,y2,z2) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",tableName);
                PreparedStatement ps = conn.prepareStatement(sql);
                int i =0;
                SmallTool.printTimeAndThread("xxxxxx");
                String mm="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxfgdslfdsjlfjdslfjdsafjdslfjdlsfjdls;jfld;sfjl;kkkkkkkkkdslfjdslfjdls;fjdsl;fjdsl;fjdsl;fjdsl;fjdsf;ldsjkfdslf" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                        "fdjslfjadslfjdsl;fjl;dsl;jsjglasdgjlds;akdsl;gjsdl;fjsdl;ffjdsl;fjdsl;fkldsjfdljfld;jldsajjawogjdslgjdsljglfjalsdjglsad;lsd;hflkdshflads;jfsdl;fjdsa" +
                    "fjdlskfjdslfjladsjflsadfjlsadjfl;dsajfl;dsjfl;adsjfl;sadlsajflsafjlsadjflasjflsaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxfgdslfdsjlfjdslfjdsafjdslfjdlsfjdls;jfld;sfjl;kkkkkkkkkdslfjdslfjdls;fjdsl;fjdsl;fjdsl;fjdsl;fjdsf;ldsjkfdslf\" +\n" ;

                while (true) {
                    for (int j=1;j<53;j++){
                        ps.setObject(j,mm);
                    }
                    //1、"攒"sql
                    ps.addBatch();
                    if (i%500==0){
                        //2、执行batch
                        ps.executeBatch();
                        //3、清空batch
                        ps.clearParameters();
                    }
                    i++;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }