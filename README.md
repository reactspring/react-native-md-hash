# React Native MD5

MD5 native module for react-native

## Installation

```sh
npm install --save react-native-md-hash
```

or

```sh
yarn add react-native-md-hash
```

### Installation (iOS)

##### Using CocoaPods (React Native 0.60 and higher)

```sh
cd ios
pod install
```

### Installation (Android)

##### React Native 0.60 and higher
- Linking automatically

## Usage

### Example

```js
import { NativeModules, Platform } from 'react-native'
var MD = NativeModules.Md

```

#### MD5
```ts
  private md5 () {
    const plain_string:string = "1234567890";
    console.log ("[iOS] plaing string : " + plain_string);

    try {
      MD.md5(plain_string).then((hash: any) => {
        console.log ("[iOS] MD5 hash : " + hash);
      })
    } catch (e) {
        console.error(e)
    }  
  }
```

#### iOS Test
```ts
[Fri Aug 21 2020 15:48:31.205]  LOG      [iOS] plaing string : 1234567890
[Fri Aug 21 2020 15:48:31.206]  LOG      [iOS] MD5 hash : e807f1fcf82d132f9bb018ca6738a19f
```

#### Android Test
```ts

```
