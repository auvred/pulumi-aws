// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutomationRuleActionFindingFieldsUpdateRelatedFinding {
    /**
     * @return The product-generated identifier for a related finding.
     * 
     */
    private String id;
    /**
     * @return The ARN of the product that generated a related finding.
     * 
     */
    private String productArn;

    private AutomationRuleActionFindingFieldsUpdateRelatedFinding() {}
    /**
     * @return The product-generated identifier for a related finding.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ARN of the product that generated a related finding.
     * 
     */
    public String productArn() {
        return this.productArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleActionFindingFieldsUpdateRelatedFinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String productArn;
        public Builder() {}
        public Builder(AutomationRuleActionFindingFieldsUpdateRelatedFinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.productArn = defaults.productArn;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("AutomationRuleActionFindingFieldsUpdateRelatedFinding", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder productArn(String productArn) {
            if (productArn == null) {
              throw new MissingRequiredPropertyException("AutomationRuleActionFindingFieldsUpdateRelatedFinding", "productArn");
            }
            this.productArn = productArn;
            return this;
        }
        public AutomationRuleActionFindingFieldsUpdateRelatedFinding build() {
            final var _resultValue = new AutomationRuleActionFindingFieldsUpdateRelatedFinding();
            _resultValue.id = id;
            _resultValue.productArn = productArn;
            return _resultValue;
        }
    }
}
