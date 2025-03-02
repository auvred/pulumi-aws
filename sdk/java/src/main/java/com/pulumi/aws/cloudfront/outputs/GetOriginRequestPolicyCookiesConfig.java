// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyCookiesConfigCookie;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOriginRequestPolicyCookiesConfig {
    private String cookieBehavior;
    private List<GetOriginRequestPolicyCookiesConfigCookie> cookies;

    private GetOriginRequestPolicyCookiesConfig() {}
    public String cookieBehavior() {
        return this.cookieBehavior;
    }
    public List<GetOriginRequestPolicyCookiesConfigCookie> cookies() {
        return this.cookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyCookiesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cookieBehavior;
        private List<GetOriginRequestPolicyCookiesConfigCookie> cookies;
        public Builder() {}
        public Builder(GetOriginRequestPolicyCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        @CustomType.Setter
        public Builder cookieBehavior(String cookieBehavior) {
            if (cookieBehavior == null) {
              throw new MissingRequiredPropertyException("GetOriginRequestPolicyCookiesConfig", "cookieBehavior");
            }
            this.cookieBehavior = cookieBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(List<GetOriginRequestPolicyCookiesConfigCookie> cookies) {
            if (cookies == null) {
              throw new MissingRequiredPropertyException("GetOriginRequestPolicyCookiesConfig", "cookies");
            }
            this.cookies = cookies;
            return this;
        }
        public Builder cookies(GetOriginRequestPolicyCookiesConfigCookie... cookies) {
            return cookies(List.of(cookies));
        }
        public GetOriginRequestPolicyCookiesConfig build() {
            final var _resultValue = new GetOriginRequestPolicyCookiesConfig();
            _resultValue.cookieBehavior = cookieBehavior;
            _resultValue.cookies = cookies;
            return _resultValue;
        }
    }
}
