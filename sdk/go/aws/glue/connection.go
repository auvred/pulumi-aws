// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Glue Connection resource.
//
// ## Example Usage
//
// ### Non-VPC Connection
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewConnection(ctx, "example", &glue.ConnectionArgs{
//				ConnectionProperties: pulumi.StringMap{
//					"JDBC_CONNECTION_URL": pulumi.String("jdbc:mysql://example.com/exampledatabase"),
//					"PASSWORD":            pulumi.String("examplepassword"),
//					"USERNAME":            pulumi.String("exampleusername"),
//				},
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### VPC Connection
//
// For more information, see the [AWS Documentation](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html#connection-JDBC-VPC).
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewConnection(ctx, "example", &glue.ConnectionArgs{
//				ConnectionProperties: pulumi.StringMap{
//					"JDBC_CONNECTION_URL": pulumi.String(fmt.Sprintf("jdbc:mysql://%v/exampledatabase", exampleAwsRdsCluster.Endpoint)),
//					"PASSWORD":            pulumi.String("examplepassword"),
//					"USERNAME":            pulumi.String("exampleusername"),
//				},
//				Name: pulumi.String("example"),
//				PhysicalConnectionRequirements: &glue.ConnectionPhysicalConnectionRequirementsArgs{
//					AvailabilityZone: pulumi.Any(exampleAwsSubnet.AvailabilityZone),
//					SecurityGroupIdLists: pulumi.StringArray{
//						exampleAwsSecurityGroup.Id,
//					},
//					SubnetId: pulumi.Any(exampleAwsSubnet.Id),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Glue Connections using the `CATALOG-ID` (AWS account ID if not custom) and `NAME`. For example:
//
// ```sh
// $ pulumi import aws:glue/connection:Connection MyConnection 123456789012:MyConnection
// ```
type Connection struct {
	pulumi.CustomResourceState

	// The ARN of the Glue Connection.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
	CatalogId pulumi.StringOutput `pulumi:"catalogId"`
	// A map of key-value pairs used as parameters for this connection.
	ConnectionProperties pulumi.StringMapOutput `pulumi:"connectionProperties"`
	// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
	ConnectionType pulumi.StringPtrOutput `pulumi:"connectionType"`
	// Description of the connection.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias pulumi.StringArrayOutput `pulumi:"matchCriterias"`
	// The name of the connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
	PhysicalConnectionRequirements ConnectionPhysicalConnectionRequirementsPtrOutput `pulumi:"physicalConnectionRequirements"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		args = &ConnectionArgs{}
	}

	if args.ConnectionProperties != nil {
		args.ConnectionProperties = pulumi.ToSecret(args.ConnectionProperties).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"connectionProperties",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("aws:glue/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("aws:glue/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// The ARN of the Glue Connection.
	Arn *string `pulumi:"arn"`
	// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
	CatalogId *string `pulumi:"catalogId"`
	// A map of key-value pairs used as parameters for this connection.
	ConnectionProperties map[string]string `pulumi:"connectionProperties"`
	// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
	ConnectionType *string `pulumi:"connectionType"`
	// Description of the connection.
	Description *string `pulumi:"description"`
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias []string `pulumi:"matchCriterias"`
	// The name of the connection.
	Name *string `pulumi:"name"`
	// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
	PhysicalConnectionRequirements *ConnectionPhysicalConnectionRequirements `pulumi:"physicalConnectionRequirements"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ConnectionState struct {
	// The ARN of the Glue Connection.
	Arn pulumi.StringPtrInput
	// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
	CatalogId pulumi.StringPtrInput
	// A map of key-value pairs used as parameters for this connection.
	ConnectionProperties pulumi.StringMapInput
	// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
	ConnectionType pulumi.StringPtrInput
	// Description of the connection.
	Description pulumi.StringPtrInput
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias pulumi.StringArrayInput
	// The name of the connection.
	Name pulumi.StringPtrInput
	// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
	PhysicalConnectionRequirements ConnectionPhysicalConnectionRequirementsPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
	CatalogId *string `pulumi:"catalogId"`
	// A map of key-value pairs used as parameters for this connection.
	ConnectionProperties map[string]string `pulumi:"connectionProperties"`
	// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
	ConnectionType *string `pulumi:"connectionType"`
	// Description of the connection.
	Description *string `pulumi:"description"`
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias []string `pulumi:"matchCriterias"`
	// The name of the connection.
	Name *string `pulumi:"name"`
	// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
	PhysicalConnectionRequirements *ConnectionPhysicalConnectionRequirements `pulumi:"physicalConnectionRequirements"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
	CatalogId pulumi.StringPtrInput
	// A map of key-value pairs used as parameters for this connection.
	ConnectionProperties pulumi.StringMapInput
	// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
	ConnectionType pulumi.StringPtrInput
	// Description of the connection.
	Description pulumi.StringPtrInput
	// A list of criteria that can be used in selecting this connection.
	MatchCriterias pulumi.StringArrayInput
	// The name of the connection.
	Name pulumi.StringPtrInput
	// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
	PhysicalConnectionRequirements ConnectionPhysicalConnectionRequirementsPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// The ARN of the Glue Connection.
func (o ConnectionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
func (o ConnectionOutput) CatalogId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.CatalogId }).(pulumi.StringOutput)
}

// A map of key-value pairs used as parameters for this connection.
func (o ConnectionOutput) ConnectionProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.ConnectionProperties }).(pulumi.StringMapOutput)
}

// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
func (o ConnectionOutput) ConnectionType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.ConnectionType }).(pulumi.StringPtrOutput)
}

// Description of the connection.
func (o ConnectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A list of criteria that can be used in selecting this connection.
func (o ConnectionOutput) MatchCriterias() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringArrayOutput { return v.MatchCriterias }).(pulumi.StringArrayOutput)
}

// The name of the connection.
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
func (o ConnectionOutput) PhysicalConnectionRequirements() ConnectionPhysicalConnectionRequirementsPtrOutput {
	return o.ApplyT(func(v *Connection) ConnectionPhysicalConnectionRequirementsPtrOutput {
		return v.PhysicalConnectionRequirements
	}).(ConnectionPhysicalConnectionRequirementsPtrOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ConnectionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ConnectionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
