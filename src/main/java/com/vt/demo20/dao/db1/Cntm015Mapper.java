package com.vt.demo20.dao.db1;

import static com.vt.demo20.dao.db1.Cntm015DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.vt.demo20.entity.db1.Cntm015;
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
public interface Cntm015Mapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(item, ctNo, proCtr, unstdCode, unstdNo, shortCode, shortNo, modNo, delDate, ioCode, payCode, cnfmCode, createId, createDate, updateId, updateDate, bsItem, bsNo, bsCfDate, comp1, comp2, comp3, aNo, remark, salTntr, srvTntr, salBegCost, recTntr, sendDate, checkDate, fileDate, code1, delSendDate, delFileDate, specCode, borrowTime, code2, costCnfDate, taxRate, salBegCost1, estAssureDate, assureAmnt, assureRate, assureDate, rtnDate, date1, date2, code3, code4, amnt, partTime, othCtCode, othTranItem, othTranCtno);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Cntm015> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Cntm015> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cntm015Result")
    Optional<Cntm015> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cntm015Result", value = {
        @Result(column="item", property="item", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ct_no", property="ctNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="pro_ctr", property="proCtr", jdbcType=JdbcType.CHAR),
        @Result(column="unstd_code", property="unstdCode", jdbcType=JdbcType.CHAR),
        @Result(column="unstd_no", property="unstdNo", jdbcType=JdbcType.CHAR),
        @Result(column="short_code", property="shortCode", jdbcType=JdbcType.CHAR),
        @Result(column="short_no", property="shortNo", jdbcType=JdbcType.CHAR),
        @Result(column="mod_no", property="modNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="del_date", property="delDate", jdbcType=JdbcType.DATE),
        @Result(column="io_code", property="ioCode", jdbcType=JdbcType.CHAR),
        @Result(column="pay_code", property="payCode", jdbcType=JdbcType.CHAR),
        @Result(column="cnfm_code", property="cnfmCode", jdbcType=JdbcType.CHAR),
        @Result(column="create_id", property="createId", jdbcType=JdbcType.CHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="update_id", property="updateId", jdbcType=JdbcType.CHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE),
        @Result(column="bs_item", property="bsItem", jdbcType=JdbcType.CHAR),
        @Result(column="bs_no", property="bsNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="bs_cf_date", property="bsCfDate", jdbcType=JdbcType.DATE),
        @Result(column="comp_1", property="comp1", jdbcType=JdbcType.CHAR),
        @Result(column="comp_2", property="comp2", jdbcType=JdbcType.CHAR),
        @Result(column="comp_3", property="comp3", jdbcType=JdbcType.CHAR),
        @Result(column="a_no", property="aNo", jdbcType=JdbcType.CHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.CHAR),
        @Result(column="sal_tntr", property="salTntr", jdbcType=JdbcType.CHAR),
        @Result(column="srv_tntr", property="srvTntr", jdbcType=JdbcType.CHAR),
        @Result(column="sal_beg_cost", property="salBegCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="rec_tntr", property="recTntr", jdbcType=JdbcType.CHAR),
        @Result(column="send_date", property="sendDate", jdbcType=JdbcType.DATE),
        @Result(column="check_date", property="checkDate", jdbcType=JdbcType.DATE),
        @Result(column="file_date", property="fileDate", jdbcType=JdbcType.DATE),
        @Result(column="code1", property="code1", jdbcType=JdbcType.CHAR),
        @Result(column="del_send_date", property="delSendDate", jdbcType=JdbcType.DATE),
        @Result(column="del_file_date", property="delFileDate", jdbcType=JdbcType.DATE),
        @Result(column="spec_code", property="specCode", jdbcType=JdbcType.CHAR),
        @Result(column="borrow_time", property="borrowTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="code2", property="code2", jdbcType=JdbcType.CHAR),
        @Result(column="cost_cnf_date", property="costCnfDate", jdbcType=JdbcType.DATE),
        @Result(column="tax_rate", property="taxRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="sal_beg_cost_1", property="salBegCost1", jdbcType=JdbcType.DECIMAL),
        @Result(column="est_assure_date", property="estAssureDate", jdbcType=JdbcType.DATE),
        @Result(column="assure_amnt", property="assureAmnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="assure_rate", property="assureRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="assure_date", property="assureDate", jdbcType=JdbcType.DATE),
        @Result(column="rtn_date", property="rtnDate", jdbcType=JdbcType.DATE),
        @Result(column="date1", property="date1", jdbcType=JdbcType.DATE),
        @Result(column="date2", property="date2", jdbcType=JdbcType.DATE),
        @Result(column="code3", property="code3", jdbcType=JdbcType.CHAR),
        @Result(column="code4", property="code4", jdbcType=JdbcType.CHAR),
        @Result(column="amnt", property="amnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="part_time", property="partTime", jdbcType=JdbcType.DECIMAL),
        @Result(column="oth_ct_code", property="othCtCode", jdbcType=JdbcType.CHAR),
        @Result(column="oth_tran_item", property="othTranItem", jdbcType=JdbcType.CHAR),
        @Result(column="oth_tran_ctno", property="othTranCtno", jdbcType=JdbcType.DECIMAL)
    })
    List<Cntm015> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String item_, Integer ctNo_) {
        return delete(c -> 
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cntm015 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm015, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(proCtr).toProperty("proCtr")
            .map(unstdCode).toProperty("unstdCode")
            .map(unstdNo).toProperty("unstdNo")
            .map(shortCode).toProperty("shortCode")
            .map(shortNo).toProperty("shortNo")
            .map(modNo).toProperty("modNo")
            .map(delDate).toProperty("delDate")
            .map(ioCode).toProperty("ioCode")
            .map(payCode).toProperty("payCode")
            .map(cnfmCode).toProperty("cnfmCode")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(bsItem).toProperty("bsItem")
            .map(bsNo).toProperty("bsNo")
            .map(bsCfDate).toProperty("bsCfDate")
            .map(comp1).toProperty("comp1")
            .map(comp2).toProperty("comp2")
            .map(comp3).toProperty("comp3")
            .map(aNo).toProperty("aNo")
            .map(remark).toProperty("remark")
            .map(salTntr).toProperty("salTntr")
            .map(srvTntr).toProperty("srvTntr")
            .map(salBegCost).toProperty("salBegCost")
            .map(recTntr).toProperty("recTntr")
            .map(sendDate).toProperty("sendDate")
            .map(checkDate).toProperty("checkDate")
            .map(fileDate).toProperty("fileDate")
            .map(code1).toProperty("code1")
            .map(delSendDate).toProperty("delSendDate")
            .map(delFileDate).toProperty("delFileDate")
            .map(specCode).toProperty("specCode")
            .map(borrowTime).toProperty("borrowTime")
            .map(code2).toProperty("code2")
            .map(costCnfDate).toProperty("costCnfDate")
            .map(taxRate).toProperty("taxRate")
            .map(salBegCost1).toProperty("salBegCost1")
            .map(estAssureDate).toProperty("estAssureDate")
            .map(assureAmnt).toProperty("assureAmnt")
            .map(assureRate).toProperty("assureRate")
            .map(assureDate).toProperty("assureDate")
            .map(rtnDate).toProperty("rtnDate")
            .map(date1).toProperty("date1")
            .map(date2).toProperty("date2")
            .map(code3).toProperty("code3")
            .map(code4).toProperty("code4")
            .map(amnt).toProperty("amnt")
            .map(partTime).toProperty("partTime")
            .map(othCtCode).toProperty("othCtCode")
            .map(othTranItem).toProperty("othTranItem")
            .map(othTranCtno).toProperty("othTranCtno")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Cntm015> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cntm015, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(proCtr).toProperty("proCtr")
            .map(unstdCode).toProperty("unstdCode")
            .map(unstdNo).toProperty("unstdNo")
            .map(shortCode).toProperty("shortCode")
            .map(shortNo).toProperty("shortNo")
            .map(modNo).toProperty("modNo")
            .map(delDate).toProperty("delDate")
            .map(ioCode).toProperty("ioCode")
            .map(payCode).toProperty("payCode")
            .map(cnfmCode).toProperty("cnfmCode")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(bsItem).toProperty("bsItem")
            .map(bsNo).toProperty("bsNo")
            .map(bsCfDate).toProperty("bsCfDate")
            .map(comp1).toProperty("comp1")
            .map(comp2).toProperty("comp2")
            .map(comp3).toProperty("comp3")
            .map(aNo).toProperty("aNo")
            .map(remark).toProperty("remark")
            .map(salTntr).toProperty("salTntr")
            .map(srvTntr).toProperty("srvTntr")
            .map(salBegCost).toProperty("salBegCost")
            .map(recTntr).toProperty("recTntr")
            .map(sendDate).toProperty("sendDate")
            .map(checkDate).toProperty("checkDate")
            .map(fileDate).toProperty("fileDate")
            .map(code1).toProperty("code1")
            .map(delSendDate).toProperty("delSendDate")
            .map(delFileDate).toProperty("delFileDate")
            .map(specCode).toProperty("specCode")
            .map(borrowTime).toProperty("borrowTime")
            .map(code2).toProperty("code2")
            .map(costCnfDate).toProperty("costCnfDate")
            .map(taxRate).toProperty("taxRate")
            .map(salBegCost1).toProperty("salBegCost1")
            .map(estAssureDate).toProperty("estAssureDate")
            .map(assureAmnt).toProperty("assureAmnt")
            .map(assureRate).toProperty("assureRate")
            .map(assureDate).toProperty("assureDate")
            .map(rtnDate).toProperty("rtnDate")
            .map(date1).toProperty("date1")
            .map(date2).toProperty("date2")
            .map(code3).toProperty("code3")
            .map(code4).toProperty("code4")
            .map(amnt).toProperty("amnt")
            .map(partTime).toProperty("partTime")
            .map(othCtCode).toProperty("othCtCode")
            .map(othTranItem).toProperty("othTranItem")
            .map(othTranCtno).toProperty("othTranCtno")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Cntm015 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm015, c ->
            c.map(item).toPropertyWhenPresent("item", record::getItem)
            .map(ctNo).toPropertyWhenPresent("ctNo", record::getCtNo)
            .map(proCtr).toPropertyWhenPresent("proCtr", record::getProCtr)
            .map(unstdCode).toPropertyWhenPresent("unstdCode", record::getUnstdCode)
            .map(unstdNo).toPropertyWhenPresent("unstdNo", record::getUnstdNo)
            .map(shortCode).toPropertyWhenPresent("shortCode", record::getShortCode)
            .map(shortNo).toPropertyWhenPresent("shortNo", record::getShortNo)
            .map(modNo).toPropertyWhenPresent("modNo", record::getModNo)
            .map(delDate).toPropertyWhenPresent("delDate", record::getDelDate)
            .map(ioCode).toPropertyWhenPresent("ioCode", record::getIoCode)
            .map(payCode).toPropertyWhenPresent("payCode", record::getPayCode)
            .map(cnfmCode).toPropertyWhenPresent("cnfmCode", record::getCnfmCode)
            .map(createId).toPropertyWhenPresent("createId", record::getCreateId)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(updateId).toPropertyWhenPresent("updateId", record::getUpdateId)
            .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
            .map(bsItem).toPropertyWhenPresent("bsItem", record::getBsItem)
            .map(bsNo).toPropertyWhenPresent("bsNo", record::getBsNo)
            .map(bsCfDate).toPropertyWhenPresent("bsCfDate", record::getBsCfDate)
            .map(comp1).toPropertyWhenPresent("comp1", record::getComp1)
            .map(comp2).toPropertyWhenPresent("comp2", record::getComp2)
            .map(comp3).toPropertyWhenPresent("comp3", record::getComp3)
            .map(aNo).toPropertyWhenPresent("aNo", record::getaNo)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(salTntr).toPropertyWhenPresent("salTntr", record::getSalTntr)
            .map(srvTntr).toPropertyWhenPresent("srvTntr", record::getSrvTntr)
            .map(salBegCost).toPropertyWhenPresent("salBegCost", record::getSalBegCost)
            .map(recTntr).toPropertyWhenPresent("recTntr", record::getRecTntr)
            .map(sendDate).toPropertyWhenPresent("sendDate", record::getSendDate)
            .map(checkDate).toPropertyWhenPresent("checkDate", record::getCheckDate)
            .map(fileDate).toPropertyWhenPresent("fileDate", record::getFileDate)
            .map(code1).toPropertyWhenPresent("code1", record::getCode1)
            .map(delSendDate).toPropertyWhenPresent("delSendDate", record::getDelSendDate)
            .map(delFileDate).toPropertyWhenPresent("delFileDate", record::getDelFileDate)
            .map(specCode).toPropertyWhenPresent("specCode", record::getSpecCode)
            .map(borrowTime).toPropertyWhenPresent("borrowTime", record::getBorrowTime)
            .map(code2).toPropertyWhenPresent("code2", record::getCode2)
            .map(costCnfDate).toPropertyWhenPresent("costCnfDate", record::getCostCnfDate)
            .map(taxRate).toPropertyWhenPresent("taxRate", record::getTaxRate)
            .map(salBegCost1).toPropertyWhenPresent("salBegCost1", record::getSalBegCost1)
            .map(estAssureDate).toPropertyWhenPresent("estAssureDate", record::getEstAssureDate)
            .map(assureAmnt).toPropertyWhenPresent("assureAmnt", record::getAssureAmnt)
            .map(assureRate).toPropertyWhenPresent("assureRate", record::getAssureRate)
            .map(assureDate).toPropertyWhenPresent("assureDate", record::getAssureDate)
            .map(rtnDate).toPropertyWhenPresent("rtnDate", record::getRtnDate)
            .map(date1).toPropertyWhenPresent("date1", record::getDate1)
            .map(date2).toPropertyWhenPresent("date2", record::getDate2)
            .map(code3).toPropertyWhenPresent("code3", record::getCode3)
            .map(code4).toPropertyWhenPresent("code4", record::getCode4)
            .map(amnt).toPropertyWhenPresent("amnt", record::getAmnt)
            .map(partTime).toPropertyWhenPresent("partTime", record::getPartTime)
            .map(othCtCode).toPropertyWhenPresent("othCtCode", record::getOthCtCode)
            .map(othTranItem).toPropertyWhenPresent("othTranItem", record::getOthTranItem)
            .map(othTranCtno).toPropertyWhenPresent("othTranCtno", record::getOthTranCtno)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm015> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm015> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm015> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm015> selectByPrimaryKey(String item_, Integer ctNo_) {
        return selectOne(c ->
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cntm015, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Cntm015 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalTo(record::getItem)
                .set(ctNo).equalTo(record::getCtNo)
                .set(proCtr).equalTo(record::getProCtr)
                .set(unstdCode).equalTo(record::getUnstdCode)
                .set(unstdNo).equalTo(record::getUnstdNo)
                .set(shortCode).equalTo(record::getShortCode)
                .set(shortNo).equalTo(record::getShortNo)
                .set(modNo).equalTo(record::getModNo)
                .set(delDate).equalTo(record::getDelDate)
                .set(ioCode).equalTo(record::getIoCode)
                .set(payCode).equalTo(record::getPayCode)
                .set(cnfmCode).equalTo(record::getCnfmCode)
                .set(createId).equalTo(record::getCreateId)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateId).equalTo(record::getUpdateId)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(bsItem).equalTo(record::getBsItem)
                .set(bsNo).equalTo(record::getBsNo)
                .set(bsCfDate).equalTo(record::getBsCfDate)
                .set(comp1).equalTo(record::getComp1)
                .set(comp2).equalTo(record::getComp2)
                .set(comp3).equalTo(record::getComp3)
                .set(aNo).equalTo(record::getaNo)
                .set(remark).equalTo(record::getRemark)
                .set(salTntr).equalTo(record::getSalTntr)
                .set(srvTntr).equalTo(record::getSrvTntr)
                .set(salBegCost).equalTo(record::getSalBegCost)
                .set(recTntr).equalTo(record::getRecTntr)
                .set(sendDate).equalTo(record::getSendDate)
                .set(checkDate).equalTo(record::getCheckDate)
                .set(fileDate).equalTo(record::getFileDate)
                .set(code1).equalTo(record::getCode1)
                .set(delSendDate).equalTo(record::getDelSendDate)
                .set(delFileDate).equalTo(record::getDelFileDate)
                .set(specCode).equalTo(record::getSpecCode)
                .set(borrowTime).equalTo(record::getBorrowTime)
                .set(code2).equalTo(record::getCode2)
                .set(costCnfDate).equalTo(record::getCostCnfDate)
                .set(taxRate).equalTo(record::getTaxRate)
                .set(salBegCost1).equalTo(record::getSalBegCost1)
                .set(estAssureDate).equalTo(record::getEstAssureDate)
                .set(assureAmnt).equalTo(record::getAssureAmnt)
                .set(assureRate).equalTo(record::getAssureRate)
                .set(assureDate).equalTo(record::getAssureDate)
                .set(rtnDate).equalTo(record::getRtnDate)
                .set(date1).equalTo(record::getDate1)
                .set(date2).equalTo(record::getDate2)
                .set(code3).equalTo(record::getCode3)
                .set(code4).equalTo(record::getCode4)
                .set(amnt).equalTo(record::getAmnt)
                .set(partTime).equalTo(record::getPartTime)
                .set(othCtCode).equalTo(record::getOthCtCode)
                .set(othTranItem).equalTo(record::getOthTranItem)
                .set(othTranCtno).equalTo(record::getOthTranCtno);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Cntm015 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalToWhenPresent(record::getItem)
                .set(ctNo).equalToWhenPresent(record::getCtNo)
                .set(proCtr).equalToWhenPresent(record::getProCtr)
                .set(unstdCode).equalToWhenPresent(record::getUnstdCode)
                .set(unstdNo).equalToWhenPresent(record::getUnstdNo)
                .set(shortCode).equalToWhenPresent(record::getShortCode)
                .set(shortNo).equalToWhenPresent(record::getShortNo)
                .set(modNo).equalToWhenPresent(record::getModNo)
                .set(delDate).equalToWhenPresent(record::getDelDate)
                .set(ioCode).equalToWhenPresent(record::getIoCode)
                .set(payCode).equalToWhenPresent(record::getPayCode)
                .set(cnfmCode).equalToWhenPresent(record::getCnfmCode)
                .set(createId).equalToWhenPresent(record::getCreateId)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateId).equalToWhenPresent(record::getUpdateId)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(bsItem).equalToWhenPresent(record::getBsItem)
                .set(bsNo).equalToWhenPresent(record::getBsNo)
                .set(bsCfDate).equalToWhenPresent(record::getBsCfDate)
                .set(comp1).equalToWhenPresent(record::getComp1)
                .set(comp2).equalToWhenPresent(record::getComp2)
                .set(comp3).equalToWhenPresent(record::getComp3)
                .set(aNo).equalToWhenPresent(record::getaNo)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(salTntr).equalToWhenPresent(record::getSalTntr)
                .set(srvTntr).equalToWhenPresent(record::getSrvTntr)
                .set(salBegCost).equalToWhenPresent(record::getSalBegCost)
                .set(recTntr).equalToWhenPresent(record::getRecTntr)
                .set(sendDate).equalToWhenPresent(record::getSendDate)
                .set(checkDate).equalToWhenPresent(record::getCheckDate)
                .set(fileDate).equalToWhenPresent(record::getFileDate)
                .set(code1).equalToWhenPresent(record::getCode1)
                .set(delSendDate).equalToWhenPresent(record::getDelSendDate)
                .set(delFileDate).equalToWhenPresent(record::getDelFileDate)
                .set(specCode).equalToWhenPresent(record::getSpecCode)
                .set(borrowTime).equalToWhenPresent(record::getBorrowTime)
                .set(code2).equalToWhenPresent(record::getCode2)
                .set(costCnfDate).equalToWhenPresent(record::getCostCnfDate)
                .set(taxRate).equalToWhenPresent(record::getTaxRate)
                .set(salBegCost1).equalToWhenPresent(record::getSalBegCost1)
                .set(estAssureDate).equalToWhenPresent(record::getEstAssureDate)
                .set(assureAmnt).equalToWhenPresent(record::getAssureAmnt)
                .set(assureRate).equalToWhenPresent(record::getAssureRate)
                .set(assureDate).equalToWhenPresent(record::getAssureDate)
                .set(rtnDate).equalToWhenPresent(record::getRtnDate)
                .set(date1).equalToWhenPresent(record::getDate1)
                .set(date2).equalToWhenPresent(record::getDate2)
                .set(code3).equalToWhenPresent(record::getCode3)
                .set(code4).equalToWhenPresent(record::getCode4)
                .set(amnt).equalToWhenPresent(record::getAmnt)
                .set(partTime).equalToWhenPresent(record::getPartTime)
                .set(othCtCode).equalToWhenPresent(record::getOthCtCode)
                .set(othTranItem).equalToWhenPresent(record::getOthTranItem)
                .set(othTranCtno).equalToWhenPresent(record::getOthTranCtno);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Cntm015 record) {
        return update(c ->
            c.set(proCtr).equalTo(record::getProCtr)
            .set(unstdCode).equalTo(record::getUnstdCode)
            .set(unstdNo).equalTo(record::getUnstdNo)
            .set(shortCode).equalTo(record::getShortCode)
            .set(shortNo).equalTo(record::getShortNo)
            .set(modNo).equalTo(record::getModNo)
            .set(delDate).equalTo(record::getDelDate)
            .set(ioCode).equalTo(record::getIoCode)
            .set(payCode).equalTo(record::getPayCode)
            .set(cnfmCode).equalTo(record::getCnfmCode)
            .set(createId).equalTo(record::getCreateId)
            .set(createDate).equalTo(record::getCreateDate)
            .set(updateId).equalTo(record::getUpdateId)
            .set(updateDate).equalTo(record::getUpdateDate)
            .set(bsItem).equalTo(record::getBsItem)
            .set(bsNo).equalTo(record::getBsNo)
            .set(bsCfDate).equalTo(record::getBsCfDate)
            .set(comp1).equalTo(record::getComp1)
            .set(comp2).equalTo(record::getComp2)
            .set(comp3).equalTo(record::getComp3)
            .set(aNo).equalTo(record::getaNo)
            .set(remark).equalTo(record::getRemark)
            .set(salTntr).equalTo(record::getSalTntr)
            .set(srvTntr).equalTo(record::getSrvTntr)
            .set(salBegCost).equalTo(record::getSalBegCost)
            .set(recTntr).equalTo(record::getRecTntr)
            .set(sendDate).equalTo(record::getSendDate)
            .set(checkDate).equalTo(record::getCheckDate)
            .set(fileDate).equalTo(record::getFileDate)
            .set(code1).equalTo(record::getCode1)
            .set(delSendDate).equalTo(record::getDelSendDate)
            .set(delFileDate).equalTo(record::getDelFileDate)
            .set(specCode).equalTo(record::getSpecCode)
            .set(borrowTime).equalTo(record::getBorrowTime)
            .set(code2).equalTo(record::getCode2)
            .set(costCnfDate).equalTo(record::getCostCnfDate)
            .set(taxRate).equalTo(record::getTaxRate)
            .set(salBegCost1).equalTo(record::getSalBegCost1)
            .set(estAssureDate).equalTo(record::getEstAssureDate)
            .set(assureAmnt).equalTo(record::getAssureAmnt)
            .set(assureRate).equalTo(record::getAssureRate)
            .set(assureDate).equalTo(record::getAssureDate)
            .set(rtnDate).equalTo(record::getRtnDate)
            .set(date1).equalTo(record::getDate1)
            .set(date2).equalTo(record::getDate2)
            .set(code3).equalTo(record::getCode3)
            .set(code4).equalTo(record::getCode4)
            .set(amnt).equalTo(record::getAmnt)
            .set(partTime).equalTo(record::getPartTime)
            .set(othCtCode).equalTo(record::getOthCtCode)
            .set(othTranItem).equalTo(record::getOthTranItem)
            .set(othTranCtno).equalTo(record::getOthTranCtno)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Cntm015 record) {
        return update(c ->
            c.set(proCtr).equalToWhenPresent(record::getProCtr)
            .set(unstdCode).equalToWhenPresent(record::getUnstdCode)
            .set(unstdNo).equalToWhenPresent(record::getUnstdNo)
            .set(shortCode).equalToWhenPresent(record::getShortCode)
            .set(shortNo).equalToWhenPresent(record::getShortNo)
            .set(modNo).equalToWhenPresent(record::getModNo)
            .set(delDate).equalToWhenPresent(record::getDelDate)
            .set(ioCode).equalToWhenPresent(record::getIoCode)
            .set(payCode).equalToWhenPresent(record::getPayCode)
            .set(cnfmCode).equalToWhenPresent(record::getCnfmCode)
            .set(createId).equalToWhenPresent(record::getCreateId)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(updateId).equalToWhenPresent(record::getUpdateId)
            .set(updateDate).equalToWhenPresent(record::getUpdateDate)
            .set(bsItem).equalToWhenPresent(record::getBsItem)
            .set(bsNo).equalToWhenPresent(record::getBsNo)
            .set(bsCfDate).equalToWhenPresent(record::getBsCfDate)
            .set(comp1).equalToWhenPresent(record::getComp1)
            .set(comp2).equalToWhenPresent(record::getComp2)
            .set(comp3).equalToWhenPresent(record::getComp3)
            .set(aNo).equalToWhenPresent(record::getaNo)
            .set(remark).equalToWhenPresent(record::getRemark)
            .set(salTntr).equalToWhenPresent(record::getSalTntr)
            .set(srvTntr).equalToWhenPresent(record::getSrvTntr)
            .set(salBegCost).equalToWhenPresent(record::getSalBegCost)
            .set(recTntr).equalToWhenPresent(record::getRecTntr)
            .set(sendDate).equalToWhenPresent(record::getSendDate)
            .set(checkDate).equalToWhenPresent(record::getCheckDate)
            .set(fileDate).equalToWhenPresent(record::getFileDate)
            .set(code1).equalToWhenPresent(record::getCode1)
            .set(delSendDate).equalToWhenPresent(record::getDelSendDate)
            .set(delFileDate).equalToWhenPresent(record::getDelFileDate)
            .set(specCode).equalToWhenPresent(record::getSpecCode)
            .set(borrowTime).equalToWhenPresent(record::getBorrowTime)
            .set(code2).equalToWhenPresent(record::getCode2)
            .set(costCnfDate).equalToWhenPresent(record::getCostCnfDate)
            .set(taxRate).equalToWhenPresent(record::getTaxRate)
            .set(salBegCost1).equalToWhenPresent(record::getSalBegCost1)
            .set(estAssureDate).equalToWhenPresent(record::getEstAssureDate)
            .set(assureAmnt).equalToWhenPresent(record::getAssureAmnt)
            .set(assureRate).equalToWhenPresent(record::getAssureRate)
            .set(assureDate).equalToWhenPresent(record::getAssureDate)
            .set(rtnDate).equalToWhenPresent(record::getRtnDate)
            .set(date1).equalToWhenPresent(record::getDate1)
            .set(date2).equalToWhenPresent(record::getDate2)
            .set(code3).equalToWhenPresent(record::getCode3)
            .set(code4).equalToWhenPresent(record::getCode4)
            .set(amnt).equalToWhenPresent(record::getAmnt)
            .set(partTime).equalToWhenPresent(record::getPartTime)
            .set(othCtCode).equalToWhenPresent(record::getOthCtCode)
            .set(othTranItem).equalToWhenPresent(record::getOthTranItem)
            .set(othTranCtno).equalToWhenPresent(record::getOthTranCtno)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
        );
    }
}