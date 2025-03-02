// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceArgs Empty = new GetResourceArgs();

    /**
     * Full path of the resource.  If no path is found, an error will be returned.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Full path of the resource.  If no path is found, an error will be returned.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * REST API id that owns the resource. If no REST API is found, an error will be returned.
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    /**
     * @return REST API id that owns the resource. If no REST API is found, an error will be returned.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    private GetResourceArgs() {}

    private GetResourceArgs(GetResourceArgs $) {
        this.path = $.path;
        this.restApiId = $.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceArgs $;

        public Builder() {
            $ = new GetResourceArgs();
        }

        public Builder(GetResourceArgs defaults) {
            $ = new GetResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Full path of the resource.  If no path is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Full path of the resource.  If no path is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param restApiId REST API id that owns the resource. If no REST API is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param restApiId REST API id that owns the resource. If no REST API is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        public GetResourceArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GetResourceArgs", "path");
            }
            if ($.restApiId == null) {
                throw new MissingRequiredPropertyException("GetResourceArgs", "restApiId");
            }
            return $;
        }
    }

}
