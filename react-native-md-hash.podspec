
Pod::Spec.new do |s|
  s.name          = 'react-native-md-hash'
  s.version       = '0.9.1'
  s.summary       = 'Native module for Message Digest'
  s.author        = "nixstory@gmail.com"
  s.license       = 'MIT'
  s.requires_arc  = true
  s.homepage      = "https://github.com/reactspring/react-native-md-hash"
  s.source        = { :git => 'https://github.com/reactspring/react-native-md-hash' }
  s.platform      = :ios, '9.0'
  s.source_files  = "ios/**/*.{h,m}"

  s.dependency "React"
end
