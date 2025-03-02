// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption {
    /**
     * @return Whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private Boolean override;

    private GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption() {}
    /**
     * @return Whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean override;
        public Builder() {}
        public Builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        @CustomType.Setter
        public Builder override(Boolean override) {
            if (override == null) {
              throw new MissingRequiredPropertyException("GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption", "override");
            }
            this.override = override;
            return this;
        }
        public GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption build() {
            final var _resultValue = new GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption();
            _resultValue.override = override;
            return _resultValue;
        }
    }
}
