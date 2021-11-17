package com.vt.demo20.dao.db1;

import static com.vt.demo20.dao.db1.Psnm110DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.vt.demo20.entity.db1.Psnm110;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface Psnm110Mapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(empNo, empName, faCen, giCen, paCen, pntr, tntr, gntr, leaveDate, telNo1, telNo2);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Psnm110> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Psnm110> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Psnm110Result")
    Optional<Psnm110> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Psnm110Result", value = {
        @Result(column="emp_no", property="empNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="emp_name", property="empName", jdbcType=JdbcType.CHAR),
        @Result(column="fa_cen", property="faCen", jdbcType=JdbcType.CHAR),
        @Result(column="gi_cen", property="giCen", jdbcType=JdbcType.CHAR),
        @Result(column="pa_cen", property="paCen", jdbcType=JdbcType.CHAR),
        @Result(column="pntr", property="pntr", jdbcType=JdbcType.CHAR),
        @Result(column="tntr", property="tntr", jdbcType=JdbcType.CHAR),
        @Result(column="gntr", property="gntr", jdbcType=JdbcType.CHAR),
        @Result(column="leave_date", property="leaveDate", jdbcType=JdbcType.DATE),
        @Result(column="tel_no1", property="telNo1", jdbcType=JdbcType.CHAR),
        @Result(column="tel_no2", property="telNo2", jdbcType=JdbcType.CHAR)
    })
    List<Psnm110> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer empNo_) {
        return delete(c -> 
            c.where(empNo, isEqualTo(empNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Psnm110 record) {
        return MyBatis3Utils.insert(this::insert, record, psnm110, c ->
            c.map(empNo).toProperty("empNo")
            .map(empName).toProperty("empName")
            .map(faCen).toProperty("faCen")
            .map(giCen).toProperty("giCen")
            .map(paCen).toProperty("paCen")
            .map(pntr).toProperty("pntr")
            .map(tntr).toProperty("tntr")
            .map(gntr).toProperty("gntr")
            .map(leaveDate).toProperty("leaveDate")
            .map(telNo1).toProperty("telNo1")
            .map(telNo2).toProperty("telNo2")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Psnm110> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, psnm110, c ->
            c.map(empNo).toProperty("empNo")
            .map(empName).toProperty("empName")
            .map(faCen).toProperty("faCen")
            .map(giCen).toProperty("giCen")
            .map(paCen).toProperty("paCen")
            .map(pntr).toProperty("pntr")
            .map(tntr).toProperty("tntr")
            .map(gntr).toProperty("gntr")
            .map(leaveDate).toProperty("leaveDate")
            .map(telNo1).toProperty("telNo1")
            .map(telNo2).toProperty("telNo2")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Psnm110 record) {
        return MyBatis3Utils.insert(this::insert, record, psnm110, c ->
            c.map(empNo).toPropertyWhenPresent("empNo", record::getEmpNo)
            .map(empName).toPropertyWhenPresent("empName", record::getEmpName)
            .map(faCen).toPropertyWhenPresent("faCen", record::getFaCen)
            .map(giCen).toPropertyWhenPresent("giCen", record::getGiCen)
            .map(paCen).toPropertyWhenPresent("paCen", record::getPaCen)
            .map(pntr).toPropertyWhenPresent("pntr", record::getPntr)
            .map(tntr).toPropertyWhenPresent("tntr", record::getTntr)
            .map(gntr).toPropertyWhenPresent("gntr", record::getGntr)
            .map(leaveDate).toPropertyWhenPresent("leaveDate", record::getLeaveDate)
            .map(telNo1).toPropertyWhenPresent("telNo1", record::getTelNo1)
            .map(telNo2).toPropertyWhenPresent("telNo2", record::getTelNo2)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Psnm110> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Psnm110> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Psnm110> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Psnm110> selectByPrimaryKey(Integer empNo_) {
        return selectOne(c ->
            c.where(empNo, isEqualTo(empNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, psnm110, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Psnm110 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalTo(record::getEmpNo)
                .set(empName).equalTo(record::getEmpName)
                .set(faCen).equalTo(record::getFaCen)
                .set(giCen).equalTo(record::getGiCen)
                .set(paCen).equalTo(record::getPaCen)
                .set(pntr).equalTo(record::getPntr)
                .set(tntr).equalTo(record::getTntr)
                .set(gntr).equalTo(record::getGntr)
                .set(leaveDate).equalTo(record::getLeaveDate)
                .set(telNo1).equalTo(record::getTelNo1)
                .set(telNo2).equalTo(record::getTelNo2);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Psnm110 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(empNo).equalToWhenPresent(record::getEmpNo)
                .set(empName).equalToWhenPresent(record::getEmpName)
                .set(faCen).equalToWhenPresent(record::getFaCen)
                .set(giCen).equalToWhenPresent(record::getGiCen)
                .set(paCen).equalToWhenPresent(record::getPaCen)
                .set(pntr).equalToWhenPresent(record::getPntr)
                .set(tntr).equalToWhenPresent(record::getTntr)
                .set(gntr).equalToWhenPresent(record::getGntr)
                .set(leaveDate).equalToWhenPresent(record::getLeaveDate)
                .set(telNo1).equalToWhenPresent(record::getTelNo1)
                .set(telNo2).equalToWhenPresent(record::getTelNo2);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Psnm110 record) {
        return update(c ->
            c.set(empName).equalTo(record::getEmpName)
            .set(faCen).equalTo(record::getFaCen)
            .set(giCen).equalTo(record::getGiCen)
            .set(paCen).equalTo(record::getPaCen)
            .set(pntr).equalTo(record::getPntr)
            .set(tntr).equalTo(record::getTntr)
            .set(gntr).equalTo(record::getGntr)
            .set(leaveDate).equalTo(record::getLeaveDate)
            .set(telNo1).equalTo(record::getTelNo1)
            .set(telNo2).equalTo(record::getTelNo2)
            .where(empNo, isEqualTo(record::getEmpNo))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Psnm110 record) {
        return update(c ->
            c.set(empName).equalToWhenPresent(record::getEmpName)
            .set(faCen).equalToWhenPresent(record::getFaCen)
            .set(giCen).equalToWhenPresent(record::getGiCen)
            .set(paCen).equalToWhenPresent(record::getPaCen)
            .set(pntr).equalToWhenPresent(record::getPntr)
            .set(tntr).equalToWhenPresent(record::getTntr)
            .set(gntr).equalToWhenPresent(record::getGntr)
            .set(leaveDate).equalToWhenPresent(record::getLeaveDate)
            .set(telNo1).equalToWhenPresent(record::getTelNo1)
            .set(telNo2).equalToWhenPresent(record::getTelNo2)
            .where(empNo, isEqualTo(record::getEmpNo))
        );
    }
}