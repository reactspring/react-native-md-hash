//
//  MDUtil.h
//
//
//  TaeHeun Lee (nixstory@gmail.com)

#import <Foundation/Foundation.h>

@interface MDUtil : NSObject
+ (NSString *) md5: (NSString *)input;
+ (NSString *) toHex: (NSData *)nsdata;
+ (NSData *) fromHex: (NSString *)string;
@end
