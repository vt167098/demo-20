package com.vt.demo20.dao.db1;

import static com.vt.demo20.dao.db1.Basm060DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.vt.demo20.entity.db1.Basm060;
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
public interface Basm060Mapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(custNo, custName, unifyNo, txCode, mainCustno, remk);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Basm060> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Basm060> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Basm060Result")
    Optional<Basm060> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Basm060Result", value = {
        @Result(column="cust_no", property="custNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="unify_no", property="unifyNo", jdbcType=JdbcType.CHAR),
        @Result(column="tx_code", property="txCode", jdbcType=JdbcType.CHAR),
        @Result(column="main_custno", property="mainCustno", jdbcType=JdbcType.DECIMAL),
        @Result(column="remk", property="remk", jdbcType=JdbcType.VARCHAR)
    })
    List<Basm060> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer custNo_) {
        return delete(c -> 
            c.where(custNo, isEqualTo(custNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Basm060 record) {
        return MyBatis3Utils.insert(this::insert, record, basm060, c ->
            c.map(custNo).toProperty("custNo")
            .map(custName).toProperty("custName")
            .map(unifyNo).toProperty("unifyNo")
            .map(txCode).toProperty("txCode")
            .map(mainCustno).toProperty("mainCustno")
            .map(remk).toProperty("remk")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Basm060> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, basm060, c ->
            c.map(custNo).toProperty("custNo")
            .map(custName).toProperty("custName")
            .map(unifyNo).toProperty("unifyNo")
            .map(txCode).toProperty("txCode")
            .map(mainCustno).toProperty("mainCustno")
            .map(remk).toProperty("remk")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Basm060 record) {
        return MyBatis3Utils.insert(this::insert, record, basm060, c ->
            c.map(custNo).toPropertyWhenPresent("custNo", record::getCustNo)
            .map(custName).toPropertyWhenPresent("custName", record::getCustName)
            .map(unifyNo).toPropertyWhenPresent("unifyNo", record::getUnifyNo)
            .map(txCode).toPropertyWhenPresent("txCode", record::getTxCode)
            .map(mainCustno).toPropertyWhenPresent("mainCustno", record::getMainCustno)
            .map(remk).toPropertyWhenPresent("remk", record::getRemk)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Basm060> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Basm060> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Basm060> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Basm060> selectByPrimaryKey(Integer custNo_) {
        return selectOne(c ->
            c.where(custNo, isEqualTo(custNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, basm060, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Basm060 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(custNo).equalTo(record::getCustNo)
                .set(custName).equalTo(record::getCustName)
                .set(unifyNo).equalTo(record::getUnifyNo)
                .set(txCode).equalTo(record::getTxCode)
                .set(mainCustno).equalTo(record::getMainCustno)
                .set(remk).equalTo(record::getRemk);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Basm060 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(custNo).equalToWhenPresent(record::getCustNo)
                .set(custName).equalToWhenPresent(record::getCustName)
                .set(unifyNo).equalToWhenPresent(record::getUnifyNo)
                .set(txCode).equalToWhenPresent(record::getTxCode)
                .set(mainCustno).equalToWhenPresent(record::getMainCustno)
                .set(remk).equalToWhenPresent(record::getRemk);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Basm060 record) {
        return update(c ->
            c.set(custName).equalTo(record::getCustName)
            .set(unifyNo).equalTo(record::getUnifyNo)
            .set(txCode).equalTo(record::getTxCode)
            .set(mainCustno).equalTo(record::getMainCustno)
            .set(remk).equalTo(record::getRemk)
            .where(custNo, isEqualTo(record::getCustNo))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Basm060 record) {
        return update(c ->
            c.set(custName).equalToWhenPresent(record::getCustName)
            .set(unifyNo).equalToWhenPresent(record::getUnifyNo)
            .set(txCode).equalToWhenPresent(record::getTxCode)
            .set(mainCustno).equalToWhenPresent(record::getMainCustno)
            .set(remk).equalToWhenPresent(record::getRemk)
            .where(custNo, isEqualTo(record::getCustNo))
        );
    }
}