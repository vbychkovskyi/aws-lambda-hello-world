package com.github.vbychkovskyi.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(final Object input, final Context context) {
        final LambdaLogger logger = context.getLogger();
        logger.log("Received message" + input);
        return "Hello, World";
    }
}
