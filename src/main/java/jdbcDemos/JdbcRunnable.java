package jdbcDemos;

import lombok.Data;
import utils.JDBCUtil;
import utils.LoggerSmallUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author y25958
 */
@Data
public class JdbcRunnable implements Runnable {

        public String tableName;
        public Properties myProp = new Properties();
        public Connection connection;

    public JdbcRunnable(String tableName,Connection connection) {
        this.tableName = tableName;
        this.connection = connection;
    }

    @Override
        public void run() {
            try {
                String sql = String.format("insert into %s(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,a2,b2,c2,d2,e2,f2,g2,h2,i2,j2,k2,l2,m2,n2,o2,p2,q2,r2,s2,t2,u2,v2,w2,x2,y2,z2) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",tableName);
                PreparedStatement ps = connection.prepareStatement(sql);
                int i =0;
                LoggerSmallUtil.printTimeAndThread("begin to start insert job");
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
                        LoggerSmallUtil.printTimeAndThread("end to insert 500 datas");
                    }
                    i++;
                    //System.out.println(String.format("batch:%s",i));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }