def log = { String type, Date createOn, String msg ->
  println "$createOn [$type] - $msg"
}

log('DEBUG', new Date(), 'This is a testing debug')
// Wed Sep 04 18:26:30 COT 2024 [DEBUG] - This is a testing debug

def debugLog = log.curry('DEBUG')
debugLog(new Date(), 'This is another debug.')
// Wed Sep 04 18:30:38 COT 2024 [DEBUG] - This is another debug.

debugLog(new Date(), 'This one more.')
// Wed Sep 04 18:30:38 COT 2024 [DEBUG] - This one more.

def todayDebugLog = log.curry('DEBUG', new Date())
todayDebugLog('Just add a debug for today')
// Wed Sep 04 18:34:29 COT 2024 [DEBUG] - Just add a debug for today

// right curry
def sameMsgLog = log.rcurry('Why same message?')
sameMsgLog('ERROR', new Date())
// Wed Sep 04 18:39:15 COT 2024 [ERROR] - Why same message?

// index base curry
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog('ERROR', 'Using a `ncurry`')
// Wed Sep 04 18:42:39 COT 2024 [ERROR] - Using a `ncurry`
