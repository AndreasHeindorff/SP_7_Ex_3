/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import model.DataFactory;
import model.Member;

/**
 * REST Web Service
 *
 * @author Andreas
 */
@Path("member")
public class MemberResource {

    @Context
    private UriInfo context;
    private DataFactory df;
    Gson gson;
    /**
     * Creates a new instance of ApiResource
     */
    public MemberResource() {
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();
    }

    // attempted to invoke private method DataFactory.getMemberAsJsonObject, but failed
    @GET
    @Produces("application/json")
    public String getAllMembers() throws Exception {
//        // initializing memberlist from DataFactory
//        // initializing JsonArray
//        List<Member> memberList = df.getMembers();
//        JsonArray ja = new JsonArray();
//        // converting members from memberlist to json objects with DataFactory.getMemberAsJsonObject(m)
//        // adding Json Member objects to JsonArray
//        for (Member m : memberList) {
//            JsonObject jo = df.getMemberAsJsonObject(m);
//            ja.add(jo);
//        }
//        // returns JsonArray as a Json String
//        String jsonString = gson.toJson(ja);
//        return jsonString;
        return df.getMembersAsJson();
    }
}
