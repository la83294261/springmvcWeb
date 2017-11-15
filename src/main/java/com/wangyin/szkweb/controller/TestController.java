package com.wangyin.szkweb.controller;

import com.google.gson.Gson;
import com.wangyin.szkweb.Domain.DataDomain;
import com.wangyin.szkweb.Domain.JsonPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shizhongkai on 2016/11/8.
 */

@Controller
@RequestMapping("/test")
public class TestController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();

    }
    @RequestMapping("/jgrid")
    public void pagejson() throws Exception {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        DataDomain dataDomain =new DataDomain();
        dataDomain.setAmount("123");
        dataDomain.setClient("123");
        dataDomain.setDate("daga");
        dataDomain.setNotes("gag");
        dataDomain.setTax("dd");
        DataDomain dataDomain2 =new DataDomain();
        dataDomain2.setAmount("123");
        dataDomain2.setClient("123");
        dataDomain2.setDate("daga");
        dataDomain2.setNotes("gag");
        dataDomain2.setTax("dd");
        JsonPage jsonPage =new JsonPage();
        jsonPage.setPage(1);
        jsonPage.setTotal(1);
        jsonPage.setRecords(2);
        List<DataDomain> list =new ArrayList<DataDomain>();
        list.add(dataDomain);
        list.add(dataDomain2);
        jsonPage.setRows(list);

        String json = new Gson().toJson(jsonPage);

        response.getWriter().print(json);
        response.getWriter().flush();
    }
  private String getString (){
      String jsondata = "{\"page\":\"1\"," +
              "      \"total\":2," +
              "      \"records\":\"13\"," +
              "      \"rows\":" +
              "          [" +
              "            {" +
              "              \"id\":\"13\"," +
              "              \"cell\":" +
              "                  [\"13\",\"2007-10-06\",\"Client 3\",\"1000.00\",\"0.00\",\"1000.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"12\"," +
              "              \"cell\":" +
              "                  [\"12\",\"2007-10-06\",\"Client 2\",\"700.00\",\"140.00\",\"840.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"11\"," +
              "              \"cell\":" +
              "                  [\"11\",\"2007-10-06\",\"Client 1\",\"600.00\",\"120.00\",\"720.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"10\"," +
              "              \"cell\":" +
              "                  [\"10\",\"2007-10-06\",\"Client 2\",\"100.00\",\"20.00\",\"120.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"9\"," +
              "              \"cell\":" +
              "                  [\"9\",\"2007-10-06\",\"Client 1\",\"200.00\",\"40.00\",\"240.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"8\"," +
              "              \"cell\":" +
              "                  [\"8\",\"2007-10-06\",\"Client 3\",\"200.00\",\"0.00\",\"200.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"7\"," +
              "              \"cell\":" +
              "                  [\"7\",\"2007-10-05\",\"Client 2\",\"120.00\",\"12.00\",\"134.00\",null]" +
              "            }," +
              "            {" +
              "              \"id\":\"6\"," +
              "              \"cell\":" +
              "                  [\"6\",\"2007-10-05\",\"Client 1\",\"50.00\",\"10.00\",\"60.00\",\"\"]" +
              "            }," +
              "            {" +
              "              \"id\":\"5\"," +
              "              \"cell\":" +
              "                  [\"5\",\"2007-10-05\",\"Client 3\",\"100.00\",\"0.00\",\"100.00\",\"no tax at all\"]" +
              "            }," +
              "            {" +
              "              \"id\":\"4\"," +
              "              \"cell\":" +
              "                  [\"4\",\"2007-10-04\",\"Client 3\",\"150.00\",\"0.00\",\"150.00\",\"no tax\"]" +
              "            }" +
              "          ]," +
              "      \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" +
              "    }";
     return jsondata;
  }
}
