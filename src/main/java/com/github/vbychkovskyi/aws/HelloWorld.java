package com.github.vbychkovskyi.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<String, String> {

    @Override
    public String handleRequest(final String input, final Context context) {
        final LambdaLogger logger = context.getLogger();
        logger.log("Received message" + input);
        return "Hello, World";
    }
}
