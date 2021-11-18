package com.vt.demo20.dao.db1;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;

import com.vt.demo20.model.Join01Model;

public interface Join01Mapper {

	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "Join01Result", value = {
			@Result(column = "item", property = "item", jdbcType = JdbcType.CHAR),
			@Result(column = "ct_no", property = "ctNo", jdbcType = JdbcType.DECIMAL),
			@Result(column = "pro_ctr", property = "proCtr", jdbcType = JdbcType.CHAR),
			@Result(column = "sal_ctr", property = "salCtr", jdbcType = JdbcType.CHAR),
			@Result(column = "cust_no", property = "custNo", jdbcType = JdbcType.DECIMAL),
			@Result(column = "work_zip", property = "workZip", jdbcType = JdbcType.CHAR),
			@Result(column = "ct_date", property = "ctDate", jdbcType = JdbcType.DATE),
			@Result(column = "ct_amnt", property = "ctAmnt", jdbcType = JdbcType.DECIMAL),
			@Result(column = "sale_no", property = "saleNo", jdbcType = JdbcType.DECIMAL),
			@Result(column = "bs_item", property = "bsItem", jdbcType = JdbcType.CHAR),
			@Result(column = "bs_no", property = "bsNo", jdbcType = JdbcType.DECIMAL),
			@Result(column = "bs_cf_date", property = "bsCfDate", jdbcType = JdbcType.DATE),
			@Result(column = "comp_2", property = "comp2", jdbcType = JdbcType.CHAR),
			@Result(column = "emp_name", property = "empName", jdbcType = JdbcType.CHAR),
			@Result(column = "pntr", property = "pntr", jdbcType = JdbcType.CHAR),
			@Result(column = "tntr", property = "tntr", jdbcType = JdbcType.CHAR),
			@Result(column = "gntr", property = "gntr", jdbcType = JdbcType.CHAR),
			@Result(column = "leave_date", property = "leaveDate", jdbcType = JdbcType.DATE),
			@Result(column = "tel_no1", property = "telNo1", jdbcType = JdbcType.CHAR),
			@Result(column = "cust_name", property = "custName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "unify_no", property = "unifyNo", jdbcType = JdbcType.CHAR),
			@Result(column = "tx_code", property = "txCode", jdbcType = JdbcType.CHAR),
			@Result(column = "main_custno", property = "mainCustno", jdbcType = JdbcType.DECIMAL) })
	List<Join01Model> selectMany(SelectStatementProvider selectStatement);

	@Select({ "select first #{first,jdbcType=INTEGER} ",
			"cntm010.item, cntm010.ct_no, cntm010.pro_ctr, cntm010.sal_ctr, cntm010.cust_no, cntm010.work_zip, ",
			"cntm010.ct_date, cntm010.ct_amnt, cntm010.sale_no, cntm015.bs_item, cntm015.bs_no, cntm015.bs_cf_date, ",
			"cntm015.comp_2, psnm110.emp_name, psnm110.pntr, psnm110.tntr, psnm110.gntr, psnm110.leave_date, ",
			"psnm110.tel_no1, basm060.cust_name, basm060.unify_no, basm060.tx_code, basm060.main_custno ",
			"from cntm010 join cntm015 on cntm010.item = cntm015.item and cntm010.ct_no=cntm015.ct_no ",
			"join psnm110 on cntm010.sale_no=psnm110.emp_no ",
			"join basm060 on cntm010.cust_no=basm060.cust_no ",
			"${whereClauseProvider.whereClause}" })
	@ResultMap("Join01Result")
	List<Join01Model> selectFirstRowWithWhereClause(@Param("whereClauseProvider") WhereClauseProvider whereClause,
			@Param("first") int first);

	@Select({ "select skip #{skip,jdbcType=INTEGER} first #{first,jdbcType=INTEGER} ",
		"a.item, a.ct_no, a.pro_ctr, a.sal_ctr, a.cust_no, a.work_zip, ",
		"a.ct_date, a.ct_amnt, a.sale_no, b.bs_item, b.bs_no, b.bs_cf_date, ",
		"b.comp_2, c.emp_name, c.pntr, c.tntr, c.gntr, c.leave_date, ",
		"c.tel_no1, d.cust_name, d.unify_no, d.tx_code, d.main_custno ",
		"from cntm010 a join cntm015 b on a.item = b.item and a.ct_no=b.ct_no ",
		"join psnm110 c on a.sale_no=c.emp_no ",
		"join basm060 d on a.cust_no=d.cust_no ",
		"${whereClauseProvider.whereClause}" })
	@ResultMap("Join01Result")
	List<Join01Model> selectSkipFirstRowWithWhereClause(@Param("whereClauseProvider") WhereClauseProvider whereClause,
		@Param("skip") int skip, @Param("first") int first);

	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	Map<String, Object> selSumAvgMinMax(SelectStatementProvider selectStatement);
}
