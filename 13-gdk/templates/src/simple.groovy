import groovy.text.SimpleTemplateEngine
import groovy.text.Template

// Three (3) Components to build a dynamic template
//  1. Engine (SimpleTemplateEngine)
//  2. Template (the email)
//  3. Data Bindings (The Data to insert into the dynamic portions of our email

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File('dymamic-email.txt'))

// data bindings
Map bindings =[
        firstName: 'Juan',
        lastName: 'Piza',
        commits: 36,
        repositories: [
                [name: 'Sudoku01', url: 'https://github.com/JDGonzal/Sudoku01', type: 'Public'],
                [name: 'apache-groovy', url: 'https://github.com/JDGonzal/apache-groovy', type: 'Public'],
                [name: 'pruebas-tecnicas', url: 'https://github.com/JDGonzal/pruebas-tecnicas', type: 'Public'],
                [name: 'sonic-runner-game', url: 'https://github.com/JDGonzal/sonic-runner-game', type: 'Public'],
                [name: 'bricks-ball-phaser', url: 'https://github.com/JDGonzal/bricks-ball-phaser', type: 'Public'],
                [name: 'apple-game-phaser', url: 'https://github.com/JDGonzal/apple-game-phaser', type: 'Public'],
                [name: 'super-mario-phaser', url: 'https://github.com/JDGonzal/super-mario-phaser', type: 'Public'],
                [name: 'APIUdemyTFRT', url: 'https://github.com/JDGonzal/APIUdemyTFRT', type: 'Public'],
                [name: 'SeleniumFreeRange', url: 'https://github.com/JDGonzal/SeleniumFreeRange', type: 'Public'],
                [name: 'psl-workshop-api-testing-js', url: 'https://github.com/JDGonzal/psl-workshop-api-testing-js', type: 'Public'],
                [name: 'casorio-20231021', url: 'https://github.com/JDGonzal/casorio-20231021', type: 'Private'],
                [name: 'MERN-stack-mysql', url: 'https://github.com/JDGonzal/MERN-stack-mysql', type: 'Public'],
                [name: 'react-typescript-zustand', url: 'https://github.com/JDGonzal/react-typescript-zustand', type: 'Public'],
                [name: 'siro-node-express-reactjs-mysql', url: 'https://github.com/JDGonzal/siro-node-express-reactjs-mysql', type: 'Public'],
                [name: 'design-video-store', url: 'https://github.com/JDGonzal/design-video-store', type: 'Public'],
                [name: 'react_redux_CRUD', url: 'https://github.com/JDGonzal/react_redux_CRUD', type: 'Public'],
                [name: 'GentelmanTestReact', url: 'https://github.com/JDGonzal/GentelmanTestReact', type: 'Public'],
                [name: 'poke-qwik', url: 'https://github.com/JDGonzal/poke-qwik', type: 'Public'],
                [name: 'react_n_typescript', url: 'https://github.com/JDGonzal/react_n_typescript', type: 'Public'],
                [name: 'VMC-LeftHand01', url: 'https://github.com/JDGonzal/VMC-LeftHand01', type: 'Private'],
                [name: 'memory-card-game', url: 'https://github.com/JDGonzal/memory-card-game', type: 'Public'],
                [name: 'react-tasks-application', url: 'https://github.com/JDGonzal/react-tasks-application', type: 'Public'],
                [name: 'cypress-training', url: 'https://github.com/JDGonzal/cypress-training', type: 'Public'],
                [name: 'udemy-node-express-reactjs-mysql', url: 'https://github.com/JDGonzal/udemy-node-express-reactjs-mysql', type: 'Public'],
                [name: 'bezkoder-react-redux-hooks-jwt-auth', url: 'https://github.com/JDGonzal/bezkoder-react-redux-hooks-jwt-auth', type: 'Public'],
                [name: 'Testcafe20200907', url: 'https://github.com/JDGonzal/Testcafe20200907', type: 'Public'],
                [name: 'joanesquivel-automationproject', url: 'https://github.com/JDGonzal/joanesquivel-automationproject', type: 'Public']
        ],
        lastRepositories: [
                [name: 'Sudoku01', url: 'https://github.com/JDGonzal/Sudoku01', type: 'Public'],
                [name: 'apache-groovy', url: 'https://github.com/JDGonzal/apache-groovy', type: 'Public'],
                [name: 'pruebas-tecnicas', url: 'https://github.com/JDGonzal/pruebas-tecnicas', type: 'Public']
        ]
]

println template.make(bindings)
