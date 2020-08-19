//
//  RCTSha.h
//
//  TaeHeun Lee (nixstory@gmail.com)

#import "RCTMd.h"
#import "CipherUtil.h"

@implementation RCTMd

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(md5:(NSString *)text
                  resolver:(RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject) {
    NSError *error = nil;
    NSString *data = [CipherUtil md5:text];
    if (data == nil) {
        reject(@"md5_fail", @"Hash error", error);
    } else {
        resolve(data);
    }
}

@end
