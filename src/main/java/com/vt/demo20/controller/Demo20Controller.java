package com.vt.demo20.controller;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.render.TableAliasCalculator;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejlchina.okhttps.HTTP;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vt.demo20.dao.db1.Basm060DynamicSqlSupport;
import com.vt.demo20.dao.db1.Cntm010DynamicSqlSupport;
import com.vt.demo20.dao.db1.Cntm010Mapper;
import com.vt.demo20.dao.db1.Cntm015DynamicSqlSupport;
import com.vt.demo20.dao.db1.Cntm015Mapper;
import com.vt.demo20.dao.db1.Join01Mapper;
import com.vt.demo20.dao.db1.Psnm110DynamicSqlSupport;
import com.vt.demo20.entity.db1.Basm060;
import com.vt.demo20.entity.db1.Cntm015;
import com.vt.demo20.model.Join01Model;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/demo20")
public class Demo20Controller {

	static HTTP http = HTTP.builder().baseUrl("http://192.6.1.48:3012/redis").build();

	@Autowired
	private Join01Mapper join01Mapper;

	@Autowired
	private Cntm015Mapper cntm015Mapper;

	@GetMapping("/join01/{item}/{ctNo}")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔一(restful style)")
	@Operation(summary = "", description = "查詢合約資料內容")
	@ResponseBody
	public ResponseEntity<?> getJoin01(@PathVariable String item, @PathVariable Integer ctNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(Cntm010DynamicSqlSupport.item, Cntm010DynamicSqlSupport.ctNo, Cntm010DynamicSqlSupport.proCtr,
						Cntm010DynamicSqlSupport.salCtr, Cntm010DynamicSqlSupport.custNo,
						Cntm010DynamicSqlSupport.saleNo, Cntm015DynamicSqlSupport.comp2,
						Cntm015DynamicSqlSupport.bsItem, Cntm015DynamicSqlSupport.bsNo)
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo)).build()
				.render(RenderingStrategies.MYBATIS3);

		return ResponseEntity.ok().body(join01Mapper.selectMany(selectStatement));
	}

	@GetMapping("/join01")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔一(parameter)")
	@ResponseBody
	public ResponseEntity<?> getJoin02(@RequestParam String item, @RequestParam Integer ctNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(Cntm010DynamicSqlSupport.item, Cntm010DynamicSqlSupport.ctNo, Cntm010DynamicSqlSupport.proCtr,
						Cntm010DynamicSqlSupport.salCtr, Cntm010DynamicSqlSupport.custNo,
						Cntm010DynamicSqlSupport.saleNo, Cntm015DynamicSqlSupport.comp2,
						Cntm015DynamicSqlSupport.bsItem, Cntm015DynamicSqlSupport.bsNo,
						Cntm015DynamicSqlSupport.bsCfDate)
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo)).build()
				.render(RenderingStrategies.MYBATIS3);

		return ResponseEntity.ok().body(join01Mapper.selectMany(selectStatement));
	}

	@GetMapping("/join02")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔二(多重選擇條件)")
	@ResponseBody
	public ResponseEntity<?> getJoin02(@RequestParam(required = false) String item,
			@RequestParam(required = false) Integer ctNo, @RequestParam Integer saleNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(Cntm010DynamicSqlSupport.item, Cntm010DynamicSqlSupport.ctNo, Cntm010DynamicSqlSupport.proCtr,
						Cntm010DynamicSqlSupport.salCtr, Cntm010DynamicSqlSupport.custNo,
						Cntm010DynamicSqlSupport.saleNo, Cntm015DynamicSqlSupport.comp2,
						Cntm015DynamicSqlSupport.bsItem, Cntm015DynamicSqlSupport.bsNo,
						Cntm015DynamicSqlSupport.bsCfDate)
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo)).build()
				.render(RenderingStrategies.MYBATIS3);

		return ResponseEntity.ok().body(join01Mapper.selectMany(selectStatement));
	}

	@GetMapping("/join03")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔三(控制輸出內容)")
	@ResponseBody
	public ResponseEntity<?> getJoin03(@RequestParam(required = false) String item,
			@RequestParam(required = false) Integer ctNo, @RequestParam Integer saleNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(Cntm010DynamicSqlSupport.item, Cntm010DynamicSqlSupport.ctNo, Cntm010DynamicSqlSupport.proCtr,
						Cntm010DynamicSqlSupport.salCtr, Cntm010DynamicSqlSupport.custNo,
						Cntm010DynamicSqlSupport.workZip, Cntm010DynamicSqlSupport.ctDate,
						Cntm010DynamicSqlSupport.ctAmnt, Cntm010DynamicSqlSupport.saleNo,
						Cntm015DynamicSqlSupport.comp2, Cntm015DynamicSqlSupport.bsItem, Cntm015DynamicSqlSupport.bsNo,
						Cntm015DynamicSqlSupport.bsCfDate)
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo)).build()
				.render(RenderingStrategies.MYBATIS3);

		return ResponseEntity.ok().body(responseData(join01Mapper.selectMany(selectStatement)));
	}

	@GetMapping("/join04")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔四(呼叫外部API資料)")
	@ResponseBody
	public ResponseEntity<?> getJoin04(@RequestParam(required = false) String item,
			@RequestParam(required = false) Integer ctNo, @RequestParam Integer saleNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(Cntm010DynamicSqlSupport.item, Cntm010DynamicSqlSupport.ctNo, Cntm010DynamicSqlSupport.proCtr,
						Cntm010DynamicSqlSupport.salCtr, Cntm010DynamicSqlSupport.custNo,
						Cntm010DynamicSqlSupport.workZip, Cntm010DynamicSqlSupport.ctDate,
						Cntm010DynamicSqlSupport.ctAmnt, Cntm010DynamicSqlSupport.saleNo,
						Cntm015DynamicSqlSupport.comp2, Cntm015DynamicSqlSupport.bsItem, Cntm015DynamicSqlSupport.bsNo,
						Cntm015DynamicSqlSupport.bsCfDate, Psnm110DynamicSqlSupport.empName,
						Psnm110DynamicSqlSupport.pntr, Psnm110DynamicSqlSupport.tntr, Psnm110DynamicSqlSupport.gntr,
						Basm060DynamicSqlSupport.custName, Basm060DynamicSqlSupport.mainCustno)
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.leftJoin(Psnm110DynamicSqlSupport.psnm110)
				.on(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.equalTo(Psnm110DynamicSqlSupport.empNo))
				.leftJoin(Basm060DynamicSqlSupport.basm060)
				.on(Cntm010DynamicSqlSupport.custNo, SqlBuilder.equalTo(Basm060DynamicSqlSupport.custNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo)).build()
				.render(RenderingStrategies.MYBATIS3);

		return ResponseEntity.ok().body(responseData2(join01Mapper.selectMany(selectStatement)));
	}

	@GetMapping("/join05/{dataid}")
	@CrossOrigin("*")
	@Tag(name = "呼叫外部API資料")
	@ResponseBody
	public String doFunction(@PathVariable String dataid) {

		return http
				.sync("https://opendata.cwb.gov.tw/fileapi/v1/opendataapi/" + dataid
						+ "?Authorization=CWB-17DF0251-1CD1-4EE7-A93D-2D0DABB02E96&format=JSON")
				.get().getBody().toString();
	}

	@GetMapping("/join06")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔六(運算)")
	@ResponseBody
	public Map<String, Object> sqlFunction(@RequestParam(required = false) String item,
			@RequestParam(required = false) Integer ctNo, @RequestParam(required = false) Integer saleNo) {

		SelectStatementProvider selectStatement = SqlBuilder
				.select(SqlBuilder.sum(Cntm010DynamicSqlSupport.ctAmnt).as("sum_ct_amnt"),
						SqlBuilder.avg(Cntm010DynamicSqlSupport.ctAmnt).as("avg_ct_amnt"),
						SqlBuilder.min(Cntm010DynamicSqlSupport.saleNo).as("min_sale_no"),
						SqlBuilder.max(Cntm010DynamicSqlSupport.saleNo).as("max_sale_no"))
				.from(Cntm010DynamicSqlSupport.cntm010).join(Cntm015DynamicSqlSupport.cntm015)
				.on(Cntm010DynamicSqlSupport.item, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.item))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.equalTo(Cntm015DynamicSqlSupport.ctNo))
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo).filter(Objects::nonNull)).build()
				.render(RenderingStrategies.MYBATIS3);

		//BigDecimal s = join01Mapper.selSumAvgMinMax(selectStatement);
		return join01Mapper.selSumAvgMinMax(selectStatement);
	}

	@GetMapping("/join08/{first}")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔八(控制輸出筆數)")
	@ResponseBody
	public ResponseEntity<?> getJoin08(@PathVariable Integer first, @RequestParam(required = false) String item,
			@RequestParam(required = false) Integer ctNo, @RequestParam Integer saleNo) {

		WhereClauseProvider whereClause = SqlBuilder
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo)).build()
				.render(RenderingStrategies.MYBATIS3, "whereClauseProvider");

		System.out.println(whereClause.getWhereClause() + "|" + whereClause.toString());
		List<Join01Model> join01 = join01Mapper.selectFirstRowWithWhereClause(whereClause, first);

		return ResponseEntity.ok().body(join01);
	}

	@GetMapping("/join09/{skip}/{first}")
	@CrossOrigin("*")
	@Tag(name = "讀取合約主檔九(控制差異與輸出筆數)")
	@ResponseBody
	public ResponseEntity<?> getJoin09(@PathVariable Integer skip, @PathVariable Integer first,
			@RequestParam(required = false) String item, @RequestParam(required = false) Integer ctNo,
			@RequestParam Integer saleNo) {

		WhereClauseProvider whereClause = SqlBuilder
				.where(Cntm010DynamicSqlSupport.item, SqlBuilder.isEqualTo(item).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.ctNo, SqlBuilder.isEqualTo(ctNo).filter(Objects::nonNull))
				.and(Cntm010DynamicSqlSupport.saleNo, SqlBuilder.isEqualTo(saleNo)).build()
				.render(RenderingStrategies.MYBATIS3,
						TableAliasCalculator.of(Cntm010DynamicSqlSupport.cntm010, "a")
								.of(Cntm015DynamicSqlSupport.cntm015, "b").of(Psnm110DynamicSqlSupport.psnm110, "c")
								.of(Basm060DynamicSqlSupport.basm060, "d"),
						"whereClauseProvider");

		System.out.println(whereClause.getWhereClause() + "|" + whereClause.toString());
		List<Join01Model> join01 = join01Mapper.selectSkipFirstRowWithWhereClause(whereClause, skip, first);

		return ResponseEntity.ok().body(join01);
	}

	@PostMapping("/save/cntm015/{item}/{ctNo}")
	@CrossOrigin("*")
	@Tag(name = "回寫合約主檔(二)-回傳格式與layout不一致")
	@ResponseBody
	// @Transactional(rollbackFor = { RuntimeException.class,
	// Exception.class }, transactionManager = "db1TransactionManager")
	public Integer saveCntm015(@PathVariable String item, @PathVariable Integer ctNo, @RequestBody Object body) {
		Integer[] rowCount = { 0 };

		ObjectMapper mapper = new ObjectMapper();
		new ArrayList<>();

		ArrayList<LinkedHashMap<String, Object>> list = (ArrayList<LinkedHashMap<String, Object>>) body;

		list.stream().forEach(c -> {
			Map<String, Object> map = c;
			Cntm015 c1 = mapper.convertValue(map, new TypeReference<Cntm015>() {
			});
			Optional<Cntm015> cntm015o = cntm015Mapper.selectByPrimaryKey(item, ctNo);
			System.out.println("1:" + cntm015o.get().getBsItem() + "|" + cntm015o.get().getBsNo().toString() + "|"
					+ cntm015o.get().getBsCfDate());

			for (String key : map.keySet()) {
				System.out.println("Key=" + key);
			}
			Cntm015 cntm015n = copy(c1, cntm015o.get());
			System.out.println(
					"2:" + cntm015n.getBsItem() + "|" + cntm015n.getBsNo().toString() + "|" + cntm015n.getBsCfDate());

			cntm015n.setUpdateId("Vincent");
			cntm015n.setUpdateDate(new Date());
			rowCount[0] += cntm015Mapper.updateByPrimaryKey(cntm015n);
		});

		return rowCount[0];
	}

	private ArrayList<Map<String, Object>> responseData(List<Join01Model> join01) {

		ArrayList<Map<String, Object>> body = new ArrayList<>();
		join01.stream().forEach(c -> {
			Map<String, Object> p = new HashMap<>();
			p.put("item", c.getItem());
			p.put("ct_no", c.getCtNo());
			p.put("pro_ctr", c.getProCtr());
			p.put("sal_ctr", c.getSalCtr());
			p.put("cust_no", c.getCustNo());
			p.put("work_zip", c.getWorkZip());
			p.put("ct_date", c.getCtDate());
			p.put("ct_amnt", c.getCtAmnt());
			p.put("sale_no", c.getSaleNo());
			p.put("emp_name", c.getEmpName());
			p.put("comp_2", c.getComp2());
			p.put("bs_item", c.getBsItem());
			p.put("bs_ct_no", c.getBsNo());
			p.put("bs_cf_date", c.getBsCfDate());

			body.add(p);
		});
		return body;
	}

	private ArrayList<Map<String, Object>> responseData2(List<Join01Model> join01) {

		ArrayList<Map<String, Object>> body = new ArrayList<>();
		String pattern1 = "item|ctNo|proCtr|salCtr|custNo|ctDate|ctAmnt|saleNo|empName|comp2|bsItem|bsNo|bsCfDate";
		String pattern2 = "workZip|pntr|tntr|gntr|mainCustno";
		Pattern r1 = Pattern.compile(pattern1);
		Pattern r2 = Pattern.compile(pattern2);
		ObjectMapper mapper = new ObjectMapper();

		join01.stream().forEach(c -> {
			Map<String, Object> p = new HashMap<>();

			Field[] fileds = c.getClass().getDeclaredFields();
			for (Field field : fileds) {
				System.out.println(field.getName());
				Matcher m1 = r1.matcher(field.getName());
				Matcher m2 = r2.matcher(field.getName());
				if (m1.find()) {
					p.put("item", c.getItem());
					p.put("ct_no", c.getCtNo());
					p.put("pro_ctr", c.getProCtr());
					p.put("sal_ctr", c.getSalCtr());
					p.put("cust_no", c.getCustNo());
					p.put("work_zip", c.getWorkZip());
					p.put("ct_date", c.getCtDate());
					p.put("ct_amnt", c.getCtAmnt());
					p.put("sale_no", c.getSaleNo());
					p.put("emp_name", c.getEmpName());
					p.put("comp_2", c.getComp2());
					p.put("bs_item", c.getBsItem());
					p.put("bs_ct_no", c.getBsNo());
					p.put("bs_cf_date", c.getBsCfDate());
				}
				if (m2.find()) {
					switch (field.getName()) {
					case "workZip":
						p.put("work_zip", c.getWorkZip());
						p.put("zip_area", http.sync("/zip/" + c.getWorkZip()).get().getBody().toString());
						break;

					case "pntr":
						p.put("pntr", c.getPntr());
						p.put("pntr_name", http.sync("/pntr/" + c.getPntr()).get().getBody().toString());
						break;

					case "tntr":
						p.put("tntr", c.getTntr());
						p.put("tntr_name", http.sync("/tntr/" + c.getTntr()).get().getBody().toString());
						break;

					case "gntr":
						p.put("gntr", c.getGntr());
						p.put("gntr_name", http.sync("/gntr/" + c.getGntr()).get().getBody().toString());
						break;

					case "mainCustno":
						if (c.getMainCustno() != null) {
							p.put("main_custno", c.getMainCustno());
							String json = http.sync("/basm060/" + c.getMainCustno()).get().getBody().toString();
							try {
								Basm060 b = mapper.readValue(json, new TypeReference<Basm060>() {
								});
								p.put("main_cust_name", b.getCustName());
							} catch (JsonMappingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								p.put("main_cust_name", "");
							} catch (JsonProcessingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								p.put("main_cust_name", "");
							}
						}
						break;

					default:
						break;
					}
				}
			}

			body.add(p);
		});

		return body;
	}

	private static <T> T copy(Object source, T target) {
		if (source == null || target == null) {
			return null;
		}

		Field[] sourceFields = source.getClass().getDeclaredFields();
		Field[] targetFields = target.getClass().getDeclaredFields();

		for (Field sourceFileField : sourceFields) {
			for (Field targeField : targetFields) {
				if (judgeAssign(sourceFileField, targeField, source, target)) {
					break;
				}
			}
		}
		return target;
	}

	private static boolean judgeAssign(Field sourceField, Field targetField, Object source, Object target) {
		try {
			// System.out.println("filed:" + sourceField.getName() + "|" +
			// targetField.getName() + "|"
			// + sourceField.getType().getTypeName() + "|" +
			// targetField.getType().getTypeName());
			if (sourceField.getName().equals(targetField.getName())
					&& sourceField.getType().getTypeName().equals(targetField.getType().getTypeName())) {
				sourceField.setAccessible(true);
				Object obj = sourceField.get(source);

				if (obj instanceof Collection) {
					Collection<?> newValue = (Collection<?>) obj;
					if (newValue.size() <= 0)
						return true;
				}

				if (obj != null) {
					targetField.setAccessible(true);
					targetField.set(target, obj);
				}

				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
