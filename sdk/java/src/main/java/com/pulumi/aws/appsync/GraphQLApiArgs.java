// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiArgs Empty = new GraphQLApiArgs();

    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @Import(name="additionalAuthenticationProviders")
    private @Nullable Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders;

    /**
     * @return One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    public Optional<Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>>> additionalAuthenticationProviders() {
        return Optional.ofNullable(this.additionalAuthenticationProviders);
    }

    /**
     * Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    /**
     * @return Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
     * 
     */
    @Import(name="introspectionConfig")
    private @Nullable Output<String> introspectionConfig;

    /**
     * @return Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
     * 
     */
    public Optional<Output<String>> introspectionConfig() {
        return Optional.ofNullable(this.introspectionConfig);
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @Import(name="lambdaAuthorizerConfig")
    private @Nullable Output<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;

    /**
     * @return Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiLambdaAuthorizerConfigArgs>> lambdaAuthorizerConfig() {
        return Optional.ofNullable(this.lambdaAuthorizerConfig);
    }

    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<GraphQLApiLogConfigArgs> logConfig;

    /**
     * @return Nested argument containing logging configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * User-supplied name for the GraphqlApi.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User-supplied name for the GraphqlApi.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @Import(name="openidConnectConfig")
    private @Nullable Output<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig;

    /**
     * @return Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiOpenidConnectConfigArgs>> openidConnectConfig() {
        return Optional.ofNullable(this.openidConnectConfig);
    }

    /**
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
     * 
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
     * 
     */
    @Import(name="queryDepthLimit")
    private @Nullable Output<Integer> queryDepthLimit;

    /**
     * @return The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
     * 
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
     * 
     */
    public Optional<Output<Integer>> queryDepthLimit() {
        return Optional.ofNullable(this.queryDepthLimit);
    }

    /**
     * The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
     * 
     */
    @Import(name="resolverCountLimit")
    private @Nullable Output<Integer> resolverCountLimit;

    /**
     * @return The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
     * 
     */
    public Optional<Output<Integer>> resolverCountLimit() {
        return Optional.ofNullable(this.resolverCountLimit);
    }

    /**
     * Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @Import(name="userPoolConfig")
    private @Nullable Output<GraphQLApiUserPoolConfigArgs> userPoolConfig;

    /**
     * @return Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiUserPoolConfigArgs>> userPoolConfig() {
        return Optional.ofNullable(this.userPoolConfig);
    }

    /**
     * Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    /**
     * @return Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
     * 
     */
    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    /**
     * Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    @Import(name="xrayEnabled")
    private @Nullable Output<Boolean> xrayEnabled;

    /**
     * @return Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> xrayEnabled() {
        return Optional.ofNullable(this.xrayEnabled);
    }

    private GraphQLApiArgs() {}

    private GraphQLApiArgs(GraphQLApiArgs $) {
        this.additionalAuthenticationProviders = $.additionalAuthenticationProviders;
        this.authenticationType = $.authenticationType;
        this.introspectionConfig = $.introspectionConfig;
        this.lambdaAuthorizerConfig = $.lambdaAuthorizerConfig;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.openidConnectConfig = $.openidConnectConfig;
        this.queryDepthLimit = $.queryDepthLimit;
        this.resolverCountLimit = $.resolverCountLimit;
        this.schema = $.schema;
        this.tags = $.tags;
        this.userPoolConfig = $.userPoolConfig;
        this.visibility = $.visibility;
        this.xrayEnabled = $.xrayEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiArgs $;

        public Builder() {
            $ = new GraphQLApiArgs();
        }

        public Builder(GraphQLApiArgs defaults) {
            $ = new GraphQLApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(@Nullable Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders) {
            $.additionalAuthenticationProviders = additionalAuthenticationProviders;
            return this;
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(List<GraphQLApiAdditionalAuthenticationProviderArgs> additionalAuthenticationProviders) {
            return additionalAuthenticationProviders(Output.of(additionalAuthenticationProviders));
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(GraphQLApiAdditionalAuthenticationProviderArgs... additionalAuthenticationProviders) {
            return additionalAuthenticationProviders(List.of(additionalAuthenticationProviders));
        }

        /**
         * @param authenticationType Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param introspectionConfig Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
         * 
         * @return builder
         * 
         */
        public Builder introspectionConfig(@Nullable Output<String> introspectionConfig) {
            $.introspectionConfig = introspectionConfig;
            return this;
        }

        /**
         * @param introspectionConfig Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
         * 
         * @return builder
         * 
         */
        public Builder introspectionConfig(String introspectionConfig) {
            return introspectionConfig(Output.of(introspectionConfig));
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(@Nullable Output<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig) {
            $.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(GraphQLApiLambdaAuthorizerConfigArgs lambdaAuthorizerConfig) {
            return lambdaAuthorizerConfig(Output.of(lambdaAuthorizerConfig));
        }

        /**
         * @param logConfig Nested argument containing logging configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(@Nullable Output<GraphQLApiLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        /**
         * @param logConfig Nested argument containing logging configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(GraphQLApiLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        /**
         * @param name User-supplied name for the GraphqlApi.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User-supplied name for the GraphqlApi.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(@Nullable Output<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig) {
            $.openidConnectConfig = openidConnectConfig;
            return this;
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(GraphQLApiOpenidConnectConfigArgs openidConnectConfig) {
            return openidConnectConfig(Output.of(openidConnectConfig));
        }

        /**
         * @param queryDepthLimit The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
         * 
         * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
         * 
         * @return builder
         * 
         */
        public Builder queryDepthLimit(@Nullable Output<Integer> queryDepthLimit) {
            $.queryDepthLimit = queryDepthLimit;
            return this;
        }

        /**
         * @param queryDepthLimit The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
         * 
         * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
         * 
         * @return builder
         * 
         */
        public Builder queryDepthLimit(Integer queryDepthLimit) {
            return queryDepthLimit(Output.of(queryDepthLimit));
        }

        /**
         * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
         * 
         * @return builder
         * 
         */
        public Builder resolverCountLimit(@Nullable Output<Integer> resolverCountLimit) {
            $.resolverCountLimit = resolverCountLimit;
            return this;
        }

        /**
         * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
         * 
         * @return builder
         * 
         */
        public Builder resolverCountLimit(Integer resolverCountLimit) {
            return resolverCountLimit(Output.of(resolverCountLimit));
        }

        /**
         * @param schema Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userPoolConfig Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(@Nullable Output<GraphQLApiUserPoolConfigArgs> userPoolConfig) {
            $.userPoolConfig = userPoolConfig;
            return this;
        }

        /**
         * @param userPoolConfig Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(GraphQLApiUserPoolConfigArgs userPoolConfig) {
            return userPoolConfig(Output.of(userPoolConfig));
        }

        /**
         * @param visibility Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        /**
         * @param xrayEnabled Whether tracing with X-ray is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder xrayEnabled(@Nullable Output<Boolean> xrayEnabled) {
            $.xrayEnabled = xrayEnabled;
            return this;
        }

        /**
         * @param xrayEnabled Whether tracing with X-ray is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder xrayEnabled(Boolean xrayEnabled) {
            return xrayEnabled(Output.of(xrayEnabled));
        }

        public GraphQLApiArgs build() {
            if ($.authenticationType == null) {
                throw new MissingRequiredPropertyException("GraphQLApiArgs", "authenticationType");
            }
            return $;
        }
    }

}
