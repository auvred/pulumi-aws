// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssumeRoleWithWebIdentity {
    /**
     * @return The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
     * 
     */
    private @Nullable String duration;
    /**
     * @return IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    private @Nullable String policy;
    /**
     * @return Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    private @Nullable List<String> policyArns;
    /**
     * @return Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
     * 
     */
    private @Nullable String roleArn;
    /**
     * @return An identifier for the assumed role session.
     * 
     */
    private @Nullable String sessionName;
    private @Nullable String webIdentityToken;
    private @Nullable String webIdentityTokenFile;

    private AssumeRoleWithWebIdentity() {}
    /**
     * @return The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    public List<String> policyArns() {
        return this.policyArns == null ? List.of() : this.policyArns;
    }
    /**
     * @return Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return An identifier for the assumed role session.
     * 
     */
    public Optional<String> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }
    public Optional<String> webIdentityToken() {
        return Optional.ofNullable(this.webIdentityToken);
    }
    public Optional<String> webIdentityTokenFile() {
        return Optional.ofNullable(this.webIdentityTokenFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssumeRoleWithWebIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String duration;
        private @Nullable String policy;
        private @Nullable List<String> policyArns;
        private @Nullable String roleArn;
        private @Nullable String sessionName;
        private @Nullable String webIdentityToken;
        private @Nullable String webIdentityTokenFile;
        public Builder() {}
        public Builder(AssumeRoleWithWebIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.webIdentityToken = defaults.webIdentityToken;
    	      this.webIdentityTokenFile = defaults.webIdentityTokenFile;
        }

        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder policyArns(@Nullable List<String> policyArns) {

            this.policyArns = policyArns;
            return this;
        }
        public Builder policyArns(String... policyArns) {
            return policyArns(List.of(policyArns));
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder sessionName(@Nullable String sessionName) {

            this.sessionName = sessionName;
            return this;
        }
        @CustomType.Setter
        public Builder webIdentityToken(@Nullable String webIdentityToken) {

            this.webIdentityToken = webIdentityToken;
            return this;
        }
        @CustomType.Setter
        public Builder webIdentityTokenFile(@Nullable String webIdentityTokenFile) {

            this.webIdentityTokenFile = webIdentityTokenFile;
            return this;
        }
        public AssumeRoleWithWebIdentity build() {
            final var _resultValue = new AssumeRoleWithWebIdentity();
            _resultValue.duration = duration;
            _resultValue.policy = policy;
            _resultValue.policyArns = policyArns;
            _resultValue.roleArn = roleArn;
            _resultValue.sessionName = sessionName;
            _resultValue.webIdentityToken = webIdentityToken;
            _resultValue.webIdentityTokenFile = webIdentityTokenFile;
            return _resultValue;
        }
    }
}
