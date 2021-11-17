package com.vt.demo20.dao.db1;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Psnm110DynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Psnm110 psnm110 = new Psnm110();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> empNo = psnm110.empNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> empName = psnm110.empName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> faCen = psnm110.faCen;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> giCen = psnm110.giCen;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> paCen = psnm110.paCen;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pntr = psnm110.pntr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tntr = psnm110.tntr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gntr = psnm110.gntr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> leaveDate = psnm110.leaveDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> telNo1 = psnm110.telNo1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> telNo2 = psnm110.telNo2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Psnm110 extends SqlTable {
        public final SqlColumn<Integer> empNo = column("emp_no", JDBCType.DECIMAL);

        public final SqlColumn<String> empName = column("emp_name", JDBCType.CHAR);

        public final SqlColumn<String> faCen = column("fa_cen", JDBCType.CHAR);

        public final SqlColumn<String> giCen = column("gi_cen", JDBCType.CHAR);

        public final SqlColumn<String> paCen = column("pa_cen", JDBCType.CHAR);

        public final SqlColumn<String> pntr = column("pntr", JDBCType.CHAR);

        public final SqlColumn<String> tntr = column("tntr", JDBCType.CHAR);

        public final SqlColumn<String> gntr = column("gntr", JDBCType.CHAR);

        public final SqlColumn<Date> leaveDate = column("leave_date", JDBCType.DATE);

        public final SqlColumn<String> telNo1 = column("tel_no1", JDBCType.CHAR);

        public final SqlColumn<String> telNo2 = column("tel_no2", JDBCType.CHAR);

        public Psnm110() {
            super("psnm110");
        }
    }
}