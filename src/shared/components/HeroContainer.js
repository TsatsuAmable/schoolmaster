import {GiPill} from 'react-icons/gi';
import {blue} from '@ant-design/colors';
import {Typography} from 'antd';

export const HeroContainer = ({children}) => (
  <div
    style={{
      display: 'flex',
      height: '100vh',
      width: '100%'
    }}>
    <aside
      style={{
        background: blue[4],
        maxWidth: '35em',
        padding: '4em'
      }}>
      <header>
        <Typography.Title
          level={2}
          style={{
            color: 'white',
            display: 'flex',
            alignItems: 'center',
            marginBottom: '2em'
          }}>
          <GiPill
            style={{
              marginRight: '0.5em'
            }}/>
          Medication Assistant
        </Typography.Title>
        <Typography.Title
          level={3}
          style={{
            color: 'white'
          }}>
          You're just a few clicks away from having your own personal medication assistant!
        </Typography.Title>
      </header>
    </aside>
    <main
      style={{
        display: 'flex',
        flexDirection: 'column',
        flex: 1,
        padding: '4em',
        boxShadow: '0 0 1em 0 rgba(0, 0, 0, .4)'
      }}>
      {children}
    </main>
  </div>
);