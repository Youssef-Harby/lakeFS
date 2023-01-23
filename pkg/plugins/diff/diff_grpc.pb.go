// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.12
// source: diff.proto

package diff

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// DifferClient is the client API for Differ service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DifferClient interface {
	Diff(ctx context.Context, in *DiffRequest, opts ...grpc.CallOption) (*DiffResponse, error)
}

type differClient struct {
	cc grpc.ClientConnInterface
}

func NewDifferClient(cc grpc.ClientConnInterface) DifferClient {
	return &differClient{cc}
}

func (c *differClient) Diff(ctx context.Context, in *DiffRequest, opts ...grpc.CallOption) (*DiffResponse, error) {
	out := new(DiffResponse)
	err := c.cc.Invoke(ctx, "/diff.Differ/Diff", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DifferServer is the server API for Differ service.
// All implementations must embed UnimplementedDifferServer
// for forward compatibility
type DifferServer interface {
	Diff(context.Context, *DiffRequest) (*DiffResponse, error)
	mustEmbedUnimplementedDifferServer()
}

// UnimplementedDifferServer must be embedded to have forward compatible implementations.
type UnimplementedDifferServer struct {
}

func (UnimplementedDifferServer) Diff(context.Context, *DiffRequest) (*DiffResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Diff not implemented")
}
func (UnimplementedDifferServer) mustEmbedUnimplementedDifferServer() {}

// UnsafeDifferServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DifferServer will
// result in compilation errors.
type UnsafeDifferServer interface {
	mustEmbedUnimplementedDifferServer()
}

func RegisterDifferServer(s grpc.ServiceRegistrar, srv DifferServer) {
	s.RegisterService(&Differ_ServiceDesc, srv)
}

func _Differ_Diff_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DiffRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DifferServer).Diff(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/diff.Differ/Diff",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DifferServer).Diff(ctx, req.(*DiffRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Differ_ServiceDesc is the grpc.ServiceDesc for Differ service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Differ_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "diff.Differ",
	HandlerType: (*DifferServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Diff",
			Handler:    _Differ_Diff_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "diff.proto",
}
