package com.aldren.transformation;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

import java.util.List;

public class JsonTransform {

    public String joltTransform(String json) {
        List<Object> specs = JsonUtils.classpathToList("/jsonSchema/student.json");
        Chainr chainr = Chainr.fromSpec(specs);

        Object input = JsonUtils.jsonToObject(json);
        Object output = chainr.transform(input);

        return JsonUtils.toPrettyJsonString(output);
    }

}
