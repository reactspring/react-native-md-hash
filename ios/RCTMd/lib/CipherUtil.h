//
//  CipherUtil.h
//
//
//  TaeHeun Lee (nixstory@gmail.com)

#import <Foundation/Foundation.h>

@interface CipherUtil : NSObject
+ (NSString *) md5: (NSString *)input;
+ (NSString *) toHex: (NSData *)nsdata;
+ (NSData *) fromHex: (NSString *)string;
@end
