# Demo-20

### WebAPI的各種操作:

* The original package name 'com.vt.demo-20' is invalid and this project uses 'com.vt.demo20' instead.

* 回寫合約主檔(二)-回傳格式與layout不一致

```
POST
/demo20/save/cntm015/{item}/{ctNo}
```

* 讀取合約主檔九(控制差異與輸出筆數)

```
GET
/demo20/join09/{skip}/{first}
```

* 讀取合約主檔八(控制輸出筆數)
```
GET
/demo20/join08/{first}
```

* 呼叫外部API資料
```
GET
/demo20/join05/{dataid}
```

* 讀取合約主檔四(呼叫外部API資料)
```
GET
/demo20/join04
```

* 讀取合約主檔三(控制輸出內容)
```
GET
/demo20/join03
```

* 讀取合約主檔二(多重選擇條件)
```
GET
/demo20/join02
```

* 讀取合約主檔一(parameter)
```
GET
/demo20/join01
```

* 讀取合約主檔一(restful style)
```
GET
/demo20/join01/{item}/{ctNo}
```
