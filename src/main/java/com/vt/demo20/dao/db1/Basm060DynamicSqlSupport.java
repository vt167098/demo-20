package com.vt.demo20.dao.db1;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Basm060DynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Basm060 basm060 = new Basm060();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> custNo = basm060.custNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> custName = basm060.custName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> unifyNo = basm060.unifyNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> txCode = basm060.txCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> mainCustno = basm060.mainCustno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> remk = basm060.remk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Basm060 extends SqlTable {
        public final SqlColumn<Integer> custNo = column("cust_no", JDBCType.DECIMAL);

        public final SqlColumn<String> custName = column("cust_name", JDBCType.VARCHAR);

        public final SqlColumn<String> unifyNo = column("unify_no", JDBCType.CHAR);

        public final SqlColumn<String> txCode = column("tx_code", JDBCType.CHAR);

        public final SqlColumn<Integer> mainCustno = column("main_custno", JDBCType.DECIMAL);

        public final SqlColumn<String> remk = column("remk", JDBCType.VARCHAR);

        public Basm060() {
            super("basm060");
        }
    }
}