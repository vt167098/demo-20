package com.vt.demo20.dao.db1;

import static com.vt.demo20.dao.db1.Cntm010DynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.vt.demo20.entity.db1.Cntm010;
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
public interface Cntm010Mapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(item, ctNo, proCtr, salCtr, custNo, workZip, ctDate, ctAmnt, cur, rate, ntAmnt, reptName, buldName, workAddr, workPhon, saleNo, cntGood, cntCar, setDate, adjDate, setCode, exhgGood, salTotl, exhgCar, setTotl, pcntPay, icDate, icCode, trnAdtl, icYyyymm, icNum, useShort, saleCode, timeM, ctQty, workCtr, invCtr, workSaleNo, oldCtno, memo1, createId, createDate, updateId, updateDate, salPcnt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Cntm010> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Cntm010> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cntm010Result")
    Optional<Cntm010> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cntm010Result", value = {
        @Result(column="item", property="item", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ct_no", property="ctNo", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="pro_ctr", property="proCtr", jdbcType=JdbcType.CHAR),
        @Result(column="sal_ctr", property="salCtr", jdbcType=JdbcType.CHAR),
        @Result(column="cust_no", property="custNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="work_zip", property="workZip", jdbcType=JdbcType.CHAR),
        @Result(column="ct_date", property="ctDate", jdbcType=JdbcType.DATE),
        @Result(column="ct_amnt", property="ctAmnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="cur", property="cur", jdbcType=JdbcType.CHAR),
        @Result(column="rate", property="rate", jdbcType=JdbcType.DECIMAL),
        @Result(column="nt_amnt", property="ntAmnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="rept_name", property="reptName", jdbcType=JdbcType.CHAR),
        @Result(column="buld_name", property="buldName", jdbcType=JdbcType.CHAR),
        @Result(column="work_addr", property="workAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="work_phon", property="workPhon", jdbcType=JdbcType.CHAR),
        @Result(column="sale_no", property="saleNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="cnt_good", property="cntGood", jdbcType=JdbcType.DATE),
        @Result(column="cnt_car", property="cntCar", jdbcType=JdbcType.DATE),
        @Result(column="set_date", property="setDate", jdbcType=JdbcType.DATE),
        @Result(column="adj_date", property="adjDate", jdbcType=JdbcType.DATE),
        @Result(column="set_code", property="setCode", jdbcType=JdbcType.CHAR),
        @Result(column="exhg_good", property="exhgGood", jdbcType=JdbcType.DATE),
        @Result(column="sal_totl", property="salTotl", jdbcType=JdbcType.DECIMAL),
        @Result(column="exhg_car", property="exhgCar", jdbcType=JdbcType.DATE),
        @Result(column="set_totl", property="setTotl", jdbcType=JdbcType.DECIMAL),
        @Result(column="pcnt_pay", property="pcntPay", jdbcType=JdbcType.CHAR),
        @Result(column="ic_date", property="icDate", jdbcType=JdbcType.DATE),
        @Result(column="ic_code", property="icCode", jdbcType=JdbcType.CHAR),
        @Result(column="trn_adtl", property="trnAdtl", jdbcType=JdbcType.CHAR),
        @Result(column="ic_yyyymm", property="icYyyymm", jdbcType=JdbcType.DECIMAL),
        @Result(column="ic_num", property="icNum", jdbcType=JdbcType.DECIMAL),
        @Result(column="use_short", property="useShort", jdbcType=JdbcType.CHAR),
        @Result(column="sale_code", property="saleCode", jdbcType=JdbcType.CHAR),
        @Result(column="time_m", property="timeM", jdbcType=JdbcType.DECIMAL),
        @Result(column="ct_qty", property="ctQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="work_ctr", property="workCtr", jdbcType=JdbcType.CHAR),
        @Result(column="inv_ctr", property="invCtr", jdbcType=JdbcType.CHAR),
        @Result(column="work_sale_no", property="workSaleNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="old_ctno", property="oldCtno", jdbcType=JdbcType.CHAR),
        @Result(column="memo1", property="memo1", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_id", property="createId", jdbcType=JdbcType.CHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="update_id", property="updateId", jdbcType=JdbcType.CHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.DATE),
        @Result(column="sal_pcnt", property="salPcnt", jdbcType=JdbcType.DECIMAL)
    })
    List<Cntm010> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String item_, Integer ctNo_) {
        return delete(c -> 
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cntm010 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm010, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(proCtr).toProperty("proCtr")
            .map(salCtr).toProperty("salCtr")
            .map(custNo).toProperty("custNo")
            .map(workZip).toProperty("workZip")
            .map(ctDate).toProperty("ctDate")
            .map(ctAmnt).toProperty("ctAmnt")
            .map(cur).toProperty("cur")
            .map(rate).toProperty("rate")
            .map(ntAmnt).toProperty("ntAmnt")
            .map(reptName).toProperty("reptName")
            .map(buldName).toProperty("buldName")
            .map(workAddr).toProperty("workAddr")
            .map(workPhon).toProperty("workPhon")
            .map(saleNo).toProperty("saleNo")
            .map(cntGood).toProperty("cntGood")
            .map(cntCar).toProperty("cntCar")
            .map(setDate).toProperty("setDate")
            .map(adjDate).toProperty("adjDate")
            .map(setCode).toProperty("setCode")
            .map(exhgGood).toProperty("exhgGood")
            .map(salTotl).toProperty("salTotl")
            .map(exhgCar).toProperty("exhgCar")
            .map(setTotl).toProperty("setTotl")
            .map(pcntPay).toProperty("pcntPay")
            .map(icDate).toProperty("icDate")
            .map(icCode).toProperty("icCode")
            .map(trnAdtl).toProperty("trnAdtl")
            .map(icYyyymm).toProperty("icYyyymm")
            .map(icNum).toProperty("icNum")
            .map(useShort).toProperty("useShort")
            .map(saleCode).toProperty("saleCode")
            .map(timeM).toProperty("timeM")
            .map(ctQty).toProperty("ctQty")
            .map(workCtr).toProperty("workCtr")
            .map(invCtr).toProperty("invCtr")
            .map(workSaleNo).toProperty("workSaleNo")
            .map(oldCtno).toProperty("oldCtno")
            .map(memo1).toProperty("memo1")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(salPcnt).toProperty("salPcnt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Cntm010> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cntm010, c ->
            c.map(item).toProperty("item")
            .map(ctNo).toProperty("ctNo")
            .map(proCtr).toProperty("proCtr")
            .map(salCtr).toProperty("salCtr")
            .map(custNo).toProperty("custNo")
            .map(workZip).toProperty("workZip")
            .map(ctDate).toProperty("ctDate")
            .map(ctAmnt).toProperty("ctAmnt")
            .map(cur).toProperty("cur")
            .map(rate).toProperty("rate")
            .map(ntAmnt).toProperty("ntAmnt")
            .map(reptName).toProperty("reptName")
            .map(buldName).toProperty("buldName")
            .map(workAddr).toProperty("workAddr")
            .map(workPhon).toProperty("workPhon")
            .map(saleNo).toProperty("saleNo")
            .map(cntGood).toProperty("cntGood")
            .map(cntCar).toProperty("cntCar")
            .map(setDate).toProperty("setDate")
            .map(adjDate).toProperty("adjDate")
            .map(setCode).toProperty("setCode")
            .map(exhgGood).toProperty("exhgGood")
            .map(salTotl).toProperty("salTotl")
            .map(exhgCar).toProperty("exhgCar")
            .map(setTotl).toProperty("setTotl")
            .map(pcntPay).toProperty("pcntPay")
            .map(icDate).toProperty("icDate")
            .map(icCode).toProperty("icCode")
            .map(trnAdtl).toProperty("trnAdtl")
            .map(icYyyymm).toProperty("icYyyymm")
            .map(icNum).toProperty("icNum")
            .map(useShort).toProperty("useShort")
            .map(saleCode).toProperty("saleCode")
            .map(timeM).toProperty("timeM")
            .map(ctQty).toProperty("ctQty")
            .map(workCtr).toProperty("workCtr")
            .map(invCtr).toProperty("invCtr")
            .map(workSaleNo).toProperty("workSaleNo")
            .map(oldCtno).toProperty("oldCtno")
            .map(memo1).toProperty("memo1")
            .map(createId).toProperty("createId")
            .map(createDate).toProperty("createDate")
            .map(updateId).toProperty("updateId")
            .map(updateDate).toProperty("updateDate")
            .map(salPcnt).toProperty("salPcnt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Cntm010 record) {
        return MyBatis3Utils.insert(this::insert, record, cntm010, c ->
            c.map(item).toPropertyWhenPresent("item", record::getItem)
            .map(ctNo).toPropertyWhenPresent("ctNo", record::getCtNo)
            .map(proCtr).toPropertyWhenPresent("proCtr", record::getProCtr)
            .map(salCtr).toPropertyWhenPresent("salCtr", record::getSalCtr)
            .map(custNo).toPropertyWhenPresent("custNo", record::getCustNo)
            .map(workZip).toPropertyWhenPresent("workZip", record::getWorkZip)
            .map(ctDate).toPropertyWhenPresent("ctDate", record::getCtDate)
            .map(ctAmnt).toPropertyWhenPresent("ctAmnt", record::getCtAmnt)
            .map(cur).toPropertyWhenPresent("cur", record::getCur)
            .map(rate).toPropertyWhenPresent("rate", record::getRate)
            .map(ntAmnt).toPropertyWhenPresent("ntAmnt", record::getNtAmnt)
            .map(reptName).toPropertyWhenPresent("reptName", record::getReptName)
            .map(buldName).toPropertyWhenPresent("buldName", record::getBuldName)
            .map(workAddr).toPropertyWhenPresent("workAddr", record::getWorkAddr)
            .map(workPhon).toPropertyWhenPresent("workPhon", record::getWorkPhon)
            .map(saleNo).toPropertyWhenPresent("saleNo", record::getSaleNo)
            .map(cntGood).toPropertyWhenPresent("cntGood", record::getCntGood)
            .map(cntCar).toPropertyWhenPresent("cntCar", record::getCntCar)
            .map(setDate).toPropertyWhenPresent("setDate", record::getSetDate)
            .map(adjDate).toPropertyWhenPresent("adjDate", record::getAdjDate)
            .map(setCode).toPropertyWhenPresent("setCode", record::getSetCode)
            .map(exhgGood).toPropertyWhenPresent("exhgGood", record::getExhgGood)
            .map(salTotl).toPropertyWhenPresent("salTotl", record::getSalTotl)
            .map(exhgCar).toPropertyWhenPresent("exhgCar", record::getExhgCar)
            .map(setTotl).toPropertyWhenPresent("setTotl", record::getSetTotl)
            .map(pcntPay).toPropertyWhenPresent("pcntPay", record::getPcntPay)
            .map(icDate).toPropertyWhenPresent("icDate", record::getIcDate)
            .map(icCode).toPropertyWhenPresent("icCode", record::getIcCode)
            .map(trnAdtl).toPropertyWhenPresent("trnAdtl", record::getTrnAdtl)
            .map(icYyyymm).toPropertyWhenPresent("icYyyymm", record::getIcYyyymm)
            .map(icNum).toPropertyWhenPresent("icNum", record::getIcNum)
            .map(useShort).toPropertyWhenPresent("useShort", record::getUseShort)
            .map(saleCode).toPropertyWhenPresent("saleCode", record::getSaleCode)
            .map(timeM).toPropertyWhenPresent("timeM", record::getTimeM)
            .map(ctQty).toPropertyWhenPresent("ctQty", record::getCtQty)
            .map(workCtr).toPropertyWhenPresent("workCtr", record::getWorkCtr)
            .map(invCtr).toPropertyWhenPresent("invCtr", record::getInvCtr)
            .map(workSaleNo).toPropertyWhenPresent("workSaleNo", record::getWorkSaleNo)
            .map(oldCtno).toPropertyWhenPresent("oldCtno", record::getOldCtno)
            .map(memo1).toPropertyWhenPresent("memo1", record::getMemo1)
            .map(createId).toPropertyWhenPresent("createId", record::getCreateId)
            .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
            .map(updateId).toPropertyWhenPresent("updateId", record::getUpdateId)
            .map(updateDate).toPropertyWhenPresent("updateDate", record::getUpdateDate)
            .map(salPcnt).toPropertyWhenPresent("salPcnt", record::getSalPcnt)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm010> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm010> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cntm010> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cntm010> selectByPrimaryKey(String item_, Integer ctNo_) {
        return selectOne(c ->
            c.where(item, isEqualTo(item_))
            .and(ctNo, isEqualTo(ctNo_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cntm010, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Cntm010 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalTo(record::getItem)
                .set(ctNo).equalTo(record::getCtNo)
                .set(proCtr).equalTo(record::getProCtr)
                .set(salCtr).equalTo(record::getSalCtr)
                .set(custNo).equalTo(record::getCustNo)
                .set(workZip).equalTo(record::getWorkZip)
                .set(ctDate).equalTo(record::getCtDate)
                .set(ctAmnt).equalTo(record::getCtAmnt)
                .set(cur).equalTo(record::getCur)
                .set(rate).equalTo(record::getRate)
                .set(ntAmnt).equalTo(record::getNtAmnt)
                .set(reptName).equalTo(record::getReptName)
                .set(buldName).equalTo(record::getBuldName)
                .set(workAddr).equalTo(record::getWorkAddr)
                .set(workPhon).equalTo(record::getWorkPhon)
                .set(saleNo).equalTo(record::getSaleNo)
                .set(cntGood).equalTo(record::getCntGood)
                .set(cntCar).equalTo(record::getCntCar)
                .set(setDate).equalTo(record::getSetDate)
                .set(adjDate).equalTo(record::getAdjDate)
                .set(setCode).equalTo(record::getSetCode)
                .set(exhgGood).equalTo(record::getExhgGood)
                .set(salTotl).equalTo(record::getSalTotl)
                .set(exhgCar).equalTo(record::getExhgCar)
                .set(setTotl).equalTo(record::getSetTotl)
                .set(pcntPay).equalTo(record::getPcntPay)
                .set(icDate).equalTo(record::getIcDate)
                .set(icCode).equalTo(record::getIcCode)
                .set(trnAdtl).equalTo(record::getTrnAdtl)
                .set(icYyyymm).equalTo(record::getIcYyyymm)
                .set(icNum).equalTo(record::getIcNum)
                .set(useShort).equalTo(record::getUseShort)
                .set(saleCode).equalTo(record::getSaleCode)
                .set(timeM).equalTo(record::getTimeM)
                .set(ctQty).equalTo(record::getCtQty)
                .set(workCtr).equalTo(record::getWorkCtr)
                .set(invCtr).equalTo(record::getInvCtr)
                .set(workSaleNo).equalTo(record::getWorkSaleNo)
                .set(oldCtno).equalTo(record::getOldCtno)
                .set(memo1).equalTo(record::getMemo1)
                .set(createId).equalTo(record::getCreateId)
                .set(createDate).equalTo(record::getCreateDate)
                .set(updateId).equalTo(record::getUpdateId)
                .set(updateDate).equalTo(record::getUpdateDate)
                .set(salPcnt).equalTo(record::getSalPcnt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Cntm010 record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(item).equalToWhenPresent(record::getItem)
                .set(ctNo).equalToWhenPresent(record::getCtNo)
                .set(proCtr).equalToWhenPresent(record::getProCtr)
                .set(salCtr).equalToWhenPresent(record::getSalCtr)
                .set(custNo).equalToWhenPresent(record::getCustNo)
                .set(workZip).equalToWhenPresent(record::getWorkZip)
                .set(ctDate).equalToWhenPresent(record::getCtDate)
                .set(ctAmnt).equalToWhenPresent(record::getCtAmnt)
                .set(cur).equalToWhenPresent(record::getCur)
                .set(rate).equalToWhenPresent(record::getRate)
                .set(ntAmnt).equalToWhenPresent(record::getNtAmnt)
                .set(reptName).equalToWhenPresent(record::getReptName)
                .set(buldName).equalToWhenPresent(record::getBuldName)
                .set(workAddr).equalToWhenPresent(record::getWorkAddr)
                .set(workPhon).equalToWhenPresent(record::getWorkPhon)
                .set(saleNo).equalToWhenPresent(record::getSaleNo)
                .set(cntGood).equalToWhenPresent(record::getCntGood)
                .set(cntCar).equalToWhenPresent(record::getCntCar)
                .set(setDate).equalToWhenPresent(record::getSetDate)
                .set(adjDate).equalToWhenPresent(record::getAdjDate)
                .set(setCode).equalToWhenPresent(record::getSetCode)
                .set(exhgGood).equalToWhenPresent(record::getExhgGood)
                .set(salTotl).equalToWhenPresent(record::getSalTotl)
                .set(exhgCar).equalToWhenPresent(record::getExhgCar)
                .set(setTotl).equalToWhenPresent(record::getSetTotl)
                .set(pcntPay).equalToWhenPresent(record::getPcntPay)
                .set(icDate).equalToWhenPresent(record::getIcDate)
                .set(icCode).equalToWhenPresent(record::getIcCode)
                .set(trnAdtl).equalToWhenPresent(record::getTrnAdtl)
                .set(icYyyymm).equalToWhenPresent(record::getIcYyyymm)
                .set(icNum).equalToWhenPresent(record::getIcNum)
                .set(useShort).equalToWhenPresent(record::getUseShort)
                .set(saleCode).equalToWhenPresent(record::getSaleCode)
                .set(timeM).equalToWhenPresent(record::getTimeM)
                .set(ctQty).equalToWhenPresent(record::getCtQty)
                .set(workCtr).equalToWhenPresent(record::getWorkCtr)
                .set(invCtr).equalToWhenPresent(record::getInvCtr)
                .set(workSaleNo).equalToWhenPresent(record::getWorkSaleNo)
                .set(oldCtno).equalToWhenPresent(record::getOldCtno)
                .set(memo1).equalToWhenPresent(record::getMemo1)
                .set(createId).equalToWhenPresent(record::getCreateId)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .set(updateId).equalToWhenPresent(record::getUpdateId)
                .set(updateDate).equalToWhenPresent(record::getUpdateDate)
                .set(salPcnt).equalToWhenPresent(record::getSalPcnt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Cntm010 record) {
        return update(c ->
            c.set(proCtr).equalTo(record::getProCtr)
            .set(salCtr).equalTo(record::getSalCtr)
            .set(custNo).equalTo(record::getCustNo)
            .set(workZip).equalTo(record::getWorkZip)
            .set(ctDate).equalTo(record::getCtDate)
            .set(ctAmnt).equalTo(record::getCtAmnt)
            .set(cur).equalTo(record::getCur)
            .set(rate).equalTo(record::getRate)
            .set(ntAmnt).equalTo(record::getNtAmnt)
            .set(reptName).equalTo(record::getReptName)
            .set(buldName).equalTo(record::getBuldName)
            .set(workAddr).equalTo(record::getWorkAddr)
            .set(workPhon).equalTo(record::getWorkPhon)
            .set(saleNo).equalTo(record::getSaleNo)
            .set(cntGood).equalTo(record::getCntGood)
            .set(cntCar).equalTo(record::getCntCar)
            .set(setDate).equalTo(record::getSetDate)
            .set(adjDate).equalTo(record::getAdjDate)
            .set(setCode).equalTo(record::getSetCode)
            .set(exhgGood).equalTo(record::getExhgGood)
            .set(salTotl).equalTo(record::getSalTotl)
            .set(exhgCar).equalTo(record::getExhgCar)
            .set(setTotl).equalTo(record::getSetTotl)
            .set(pcntPay).equalTo(record::getPcntPay)
            .set(icDate).equalTo(record::getIcDate)
            .set(icCode).equalTo(record::getIcCode)
            .set(trnAdtl).equalTo(record::getTrnAdtl)
            .set(icYyyymm).equalTo(record::getIcYyyymm)
            .set(icNum).equalTo(record::getIcNum)
            .set(useShort).equalTo(record::getUseShort)
            .set(saleCode).equalTo(record::getSaleCode)
            .set(timeM).equalTo(record::getTimeM)
            .set(ctQty).equalTo(record::getCtQty)
            .set(workCtr).equalTo(record::getWorkCtr)
            .set(invCtr).equalTo(record::getInvCtr)
            .set(workSaleNo).equalTo(record::getWorkSaleNo)
            .set(oldCtno).equalTo(record::getOldCtno)
            .set(memo1).equalTo(record::getMemo1)
            .set(createId).equalTo(record::getCreateId)
            .set(createDate).equalTo(record::getCreateDate)
            .set(updateId).equalTo(record::getUpdateId)
            .set(updateDate).equalTo(record::getUpdateDate)
            .set(salPcnt).equalTo(record::getSalPcnt)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Cntm010 record) {
        return update(c ->
            c.set(proCtr).equalToWhenPresent(record::getProCtr)
            .set(salCtr).equalToWhenPresent(record::getSalCtr)
            .set(custNo).equalToWhenPresent(record::getCustNo)
            .set(workZip).equalToWhenPresent(record::getWorkZip)
            .set(ctDate).equalToWhenPresent(record::getCtDate)
            .set(ctAmnt).equalToWhenPresent(record::getCtAmnt)
            .set(cur).equalToWhenPresent(record::getCur)
            .set(rate).equalToWhenPresent(record::getRate)
            .set(ntAmnt).equalToWhenPresent(record::getNtAmnt)
            .set(reptName).equalToWhenPresent(record::getReptName)
            .set(buldName).equalToWhenPresent(record::getBuldName)
            .set(workAddr).equalToWhenPresent(record::getWorkAddr)
            .set(workPhon).equalToWhenPresent(record::getWorkPhon)
            .set(saleNo).equalToWhenPresent(record::getSaleNo)
            .set(cntGood).equalToWhenPresent(record::getCntGood)
            .set(cntCar).equalToWhenPresent(record::getCntCar)
            .set(setDate).equalToWhenPresent(record::getSetDate)
            .set(adjDate).equalToWhenPresent(record::getAdjDate)
            .set(setCode).equalToWhenPresent(record::getSetCode)
            .set(exhgGood).equalToWhenPresent(record::getExhgGood)
            .set(salTotl).equalToWhenPresent(record::getSalTotl)
            .set(exhgCar).equalToWhenPresent(record::getExhgCar)
            .set(setTotl).equalToWhenPresent(record::getSetTotl)
            .set(pcntPay).equalToWhenPresent(record::getPcntPay)
            .set(icDate).equalToWhenPresent(record::getIcDate)
            .set(icCode).equalToWhenPresent(record::getIcCode)
            .set(trnAdtl).equalToWhenPresent(record::getTrnAdtl)
            .set(icYyyymm).equalToWhenPresent(record::getIcYyyymm)
            .set(icNum).equalToWhenPresent(record::getIcNum)
            .set(useShort).equalToWhenPresent(record::getUseShort)
            .set(saleCode).equalToWhenPresent(record::getSaleCode)
            .set(timeM).equalToWhenPresent(record::getTimeM)
            .set(ctQty).equalToWhenPresent(record::getCtQty)
            .set(workCtr).equalToWhenPresent(record::getWorkCtr)
            .set(invCtr).equalToWhenPresent(record::getInvCtr)
            .set(workSaleNo).equalToWhenPresent(record::getWorkSaleNo)
            .set(oldCtno).equalToWhenPresent(record::getOldCtno)
            .set(memo1).equalToWhenPresent(record::getMemo1)
            .set(createId).equalToWhenPresent(record::getCreateId)
            .set(createDate).equalToWhenPresent(record::getCreateDate)
            .set(updateId).equalToWhenPresent(record::getUpdateId)
            .set(updateDate).equalToWhenPresent(record::getUpdateDate)
            .set(salPcnt).equalToWhenPresent(record::getSalPcnt)
            .where(item, isEqualTo(record::getItem))
            .and(ctNo, isEqualTo(record::getCtNo))
        );
    }
}