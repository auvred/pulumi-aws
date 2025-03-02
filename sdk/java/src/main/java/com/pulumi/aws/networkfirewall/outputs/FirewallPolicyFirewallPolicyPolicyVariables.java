// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyFirewallPolicyPolicyVariables {
    private @Nullable List<FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable> ruleVariables;

    private FirewallPolicyFirewallPolicyPolicyVariables() {}
    public List<FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable> ruleVariables() {
        return this.ruleVariables == null ? List.of() : this.ruleVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyPolicyVariables defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable> ruleVariables;
        public Builder() {}
        public Builder(FirewallPolicyFirewallPolicyPolicyVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
        }

        @CustomType.Setter
        public Builder ruleVariables(@Nullable List<FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable> ruleVariables) {

            this.ruleVariables = ruleVariables;
            return this;
        }
        public Builder ruleVariables(FirewallPolicyFirewallPolicyPolicyVariablesRuleVariable... ruleVariables) {
            return ruleVariables(List.of(ruleVariables));
        }
        public FirewallPolicyFirewallPolicyPolicyVariables build() {
            final var _resultValue = new FirewallPolicyFirewallPolicyPolicyVariables();
            _resultValue.ruleVariables = ruleVariables;
            return _resultValue;
        }
    }
}
